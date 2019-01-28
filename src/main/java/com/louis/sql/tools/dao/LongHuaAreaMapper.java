package com.louis.sql.tools.dao;

import java.util.List;

import com.louis.sql.tools.model.LongHuaAreaDO;

public interface LongHuaAreaMapper {
    int insert(LongHuaAreaDO record);

    int insertSelective(LongHuaAreaDO record);
    
    List<LongHuaAreaDO> listAll();
    
    int deleteById(String id);
    
    int deleteByName(String name);
}