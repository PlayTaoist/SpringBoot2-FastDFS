/**   
 * @author lr
 * @date 2018年12月26日 下午9:26:02 
 * @version V1.0.0   
 */
package com.louis.sql.tools.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.louis.sql.tools.model.LongHuaAreaDO;

public interface LongHuaAreaService {

    /** 
     * @Title: listAll 
     * @Description: 查询所有的龙华区监管人员
     * @param @return  参数说明 
     * @return String    返回类型 
     * @throws 
     */
    List<LongHuaAreaDO> listAll();

    /** 
     * @Title: deleteByName 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param records
     * @param @return  参数说明 
     * @return String    返回类型 
     * @throws 
     */
    int deleteByName(List<LongHuaAreaDO> records);

    /** 
     * @Title: delete 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param record
     * @param @return  参数说明 
     * @return int    返回类型 
     * @throws 
     */
    int delete(LongHuaAreaDO record);

    /** 
     * @Title: batchImport 
     * @Description: 导入Excel中的数据 
     * @param @param fileName
     * @param @param file  参数说明 
     * @return void    返回类型 
     * @throws 
     */
    void batchImport(String fileName, MultipartFile file) throws IOException, Exception;

}
