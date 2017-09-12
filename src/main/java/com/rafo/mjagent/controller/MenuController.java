package com.rafo.mjagent.controller;

import com.rafo.mjagent.model.Menu;
import com.rafo.mjagent.service.MenuService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/11.
 */
@Controller
public class MenuController {
    @Autowired
    MenuService menuService;
    @RequestMapping("/getMenu.do")
    @ResponseBody
    public List<Menu> test(Model model){
        List<Menu> menu  = menuService.loadMenu();
        return menu;
    }

    @RequestMapping("/getMenuAll.do")
    @ResponseBody
    public List<Menu> getMenuAll(Model model){
        List<Menu> menu  = menuService.getAll();
        return menu;
    }
}
