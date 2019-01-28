/**   
 * @author lr
 * @date 2018年12月26日 下午9:26:50 
 * @version V1.0.0   
 */
package com.louis.sql.tools.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.sql.tools.dao.LongHuaAreaMapper;
import com.louis.sql.tools.model.LongHuaAreaDO;
import com.louis.sql.tools.service.LongHuaAreaService;

@Service
public class LongHuaAreaServiceImpl implements LongHuaAreaService{

    @Autowired
    private LongHuaAreaMapper longHuaAreaMapper;
    
    @Override
    public List<LongHuaAreaDO> listAll() {
        
        return longHuaAreaMapper.listAll();
    }

    @Override
    public int delete(LongHuaAreaDO record) {
            return longHuaAreaMapper.deleteByName(record.getName());
    }
    
    @Override
    public int deleteByName(List<LongHuaAreaDO> records) {
        for (LongHuaAreaDO record : records) {
            delete(record);
        }
        return 1;
    }


}
