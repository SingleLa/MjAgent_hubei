package com.rafo.mjagent.mapper.agency;

import com.rafo.mjagent.model.agency.Menu;

import java.util.List;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> selectByLevel(int level);

    List<Menu> selectByMene(Menu menu);



}