/**   
 * @author lr
 * @date 2018年12月26日 下午9:26:02 
 * @version V1.0.0   
 */
package com.louis.sql.tools.service;

import java.util.List;

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

}
