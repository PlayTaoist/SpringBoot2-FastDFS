/**   
 * @author lr
 * @date 2018年12月26日 下午9:26:50 
 * @version V1.0.0   
 */
package com.louis.sql.tools.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.louis.sql.tools.dao.LongHuaAreaMapper;
import com.louis.sql.tools.model.LongHuaAreaDO;
import com.louis.sql.tools.service.LongHuaAreaService;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;

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

    /*
     * Title: batchImport
     *Description: 
     * @param fileName
     * @param file 
     * @see com.louis.sql.tools.service.LongHuaAreaService#batchImport(java.lang.String, org.springframework.web.multipart.MultipartFile) 
     */
    @Transactional(readOnly = false,rollbackFor = Exception.class)
    @Override
    public void batchImport(String fileName, MultipartFile file) throws IOException, Exception {
        ImportParams params = new ImportParams();
        params.setTitleRows(0);
        params.setHeadRows(1);
        List<LongHuaAreaDO> list = ExcelImportUtil.importExcel(file.getInputStream(), LongHuaAreaDO.class, params);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
            System.out.println(list.get(i).getId());
        }
        
    }


}
