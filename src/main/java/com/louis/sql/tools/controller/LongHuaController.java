/**   
 * @author lr
 * @date 2018年12月26日 下午6:51:43 
 * @version V1.0.0   
 */
package com.louis.sql.tools.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.louis.sql.tools.model.LongHuaAreaDO;
import com.louis.sql.tools.result.HttpResult;
import com.louis.sql.tools.service.LongHuaAreaService;

@RestController
@RequestMapping("longhua")
public class LongHuaController {

    @Autowired
    private LongHuaAreaService longHuaAreaService;
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public HttpResult listAllData(){
        return HttpResult.ok(longHuaAreaService.listAll());
    }
    
    @RequestMapping(value = "/deleteByName", method = RequestMethod.DELETE)
    public HttpResult deleteByName(@RequestBody List<LongHuaAreaDO> records) {
        
        return HttpResult.ok(longHuaAreaService.deleteByName(records));
    }
}
