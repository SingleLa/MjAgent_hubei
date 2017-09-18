package com.rafo.mjagent.mapper.agency;

import com.rafo.mjagent.model.agency.AgencyCashLog;

public interface AgencyCashLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AgencyCashLog record);

    int insertSelective(AgencyCashLog record);

    AgencyCashLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgencyCashLog record);

    int updateByPrimaryKey(AgencyCashLog record);
}