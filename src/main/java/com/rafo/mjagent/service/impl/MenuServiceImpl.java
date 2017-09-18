package com.rafo.mjagent.service.impl;

import com.rafo.mjagent.mapper.agency.MenuMapper;
import com.rafo.mjagent.model.agency.Menu;
import com.rafo.mjagent.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/9/11.
 */
@Service
public class MenuServiceImpl implements MenuService{
    private static final int PARENT_LEVEL = 0;
    @Autowired MenuMapper menuMapper;

    @Override
    public List<Menu> loadMenu() {
        List<Menu> parentMenu = menuMapper.selectByLevel(PARENT_LEVEL);
        if(parentMenu == null){
            return  null;
        }
        for(Menu m : parentMenu){
            m = getChildrenMenu(m);
        }
        Collections.sort(parentMenu);
        return parentMenu;
    }

    @Override
    public List<Menu> getAll() {
        Menu param = new Menu();
        return menuMapper.selectByMene(param);
    }

    private Menu getChildrenMenu(Menu parent){
        Menu param = new Menu();
        param.setParents(parent.getId());
        param.setActive(true);
        List<Menu> children = menuMapper.selectByMene(param);
        if(children != null){
            Collections.sort(children);
            for(Menu c:children){
                c = getChildrenMenu(c);
            }
            parent.setChildren(children);
        }
        return  parent;
    }
}
