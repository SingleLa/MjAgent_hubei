package com.rafo.mjagent.service;

import com.rafo.mjagent.mapper.agent.MenuMapper;
import com.rafo.mjagent.model.Menu;

import java.util.List;

/**
 * Created by Administrator on 2017/9/11.
 */
public interface MenuService {
    public List<Menu> loadMenu();

    public List<Menu> getAll();
}
