/**   
 * @author lr
 * @date 2018年12月26日 下午6:51:43 
 * @version V1.0.0   
 */
package com.louis.sql.tools.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.louis.sql.tools.model.LongHuaAreaDO;
import com.louis.sql.tools.result.HttpResult;
import com.louis.sql.tools.service.LongHuaAreaService;

@RestController
@RequestMapping("longhua")
public class LongHuaController {

    @Autowired
    private LongHuaAreaService longHuaAreaService;
    /**
     * @Title: listAllData 
     * @Description: 查询处所有的数据并展示
     * @param @return  参数说明 
     * @return HttpResult    返回类型 
     * @throws
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public HttpResult listAllData(){
        return HttpResult.ok(longHuaAreaService.listAll());
    }
    
    @RequestMapping(value = "/deleteByName", method = RequestMethod.DELETE)
    public HttpResult deleteByName(@RequestBody List<LongHuaAreaDO> records) {
        
        return HttpResult.ok(longHuaAreaService.deleteByName(records));
    }
    
    /**
     * @Title: importExcel 
     * @Description: 导入Excel方法
     * @param @param file  参数说明 
     * @return void    返回类型 
     * @throws
     */
    @PostMapping("/importExcel")
    public void importExcel(@RequestParam("file") MultipartFile file) {
        String fileName = file.getOriginalFilename();
        try {
            longHuaAreaService.batchImport(fileName, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
