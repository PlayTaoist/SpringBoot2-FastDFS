/**   
 * @author lr
 * @date 2018年12月26日 下午6:32:48 
 * @version V1.0.0   
 */
package com.louis.sql.tools.model;

import java.io.Serializable;
import java.util.Date;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

@ExcelTarget("BZ_JCRY")
public class LongHuaAreaDO implements Serializable{

    private static final long serialVersionUID = -4277023292843262708L;

    @Excel(name = "ID", orderNum = "0")
    private String id;
    @Excel(name = "编号", orderNum = "1")
    private String cerNo;
    @Excel(name = "姓名", orderNum = "2")
    private String legalNo;
    @Excel(name = "姓名", orderNum = "3")
    private String name;
    @Excel(name = "性别", replace = {"男_0", "女_1"}, orderNum = "4")
    private String sex;
    @Excel(name = "手机号", orderNum = "5")
    private String mobTel;
    @Excel(name = "单位名称", orderNum = "6")
    private String corpName;
    @Excel(name = "部门名称", orderNum = "7")
    private String deptName;
    @Excel(name = "职位", orderNum = "8")
    private String post;
    @Excel(name = "专门", orderNum = "9")
    private String expertise;
    @Excel(name = "组织机构", orderNum = "10")
    private String regOrg;
    @Excel(name = "组织机构简称", orderNum = "11")
    private String bizOrg;
    @Excel(name = "更新时间", exportFormat = "yyyy-MM-dd HH:mm:ss", orderNum = "12")
    private Date updateTime;
    @Excel(name = "办公室名称", orderNum = "13")
    private String officeName;
    @Excel(name = "单位编码", orderNum = "14")
    private String corpCode;
    @Excel(name = "部门编码", orderNum = "15")
    private String deptCode;
    @Excel(name = "创建时间", exportFormat = "yyyy-MM-dd HH:mm:ss", orderNum = "16")
    private Date createTime;
    @Excel(name = "雇佣编号", orderNum = "17")
    private String employeeCode;
    @Excel(name = "是否在职", orderNum = "18")
    private String isextract;

    
    @Override
    public String toString() {
        return "LongHuaAreaDO [id=" + id + ", cerNo=" + cerNo + ", legalNo=" + legalNo + ", name=" + name
                + ", sex=" + sex + ", mobTel=" + mobTel + ", corpName=" + corpName + ", deptName=" + deptName
                + ", post=" + post + ", expertise=" + expertise + ", regOrg=" + regOrg + ", bizOrg=" + bizOrg
                + ", updateTime=" + updateTime + ", officeName=" + officeName + ", corpCode=" + corpCode
                + ", deptCode=" + deptCode + ", createTime=" + createTime + ", employeeCode=" + employeeCode
                + ", isextract=" + isextract + "]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCerNo() {
        return cerNo;
    }

    public void setCerNo(String cerNo) {
        this.cerNo = cerNo == null ? null : cerNo.trim();
    }

    public String getLegalNo() {
        return legalNo;
    }

    public void setLegalNo(String legalNo) {
        this.legalNo = legalNo == null ? null : legalNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getMobTel() {
        return mobTel;
    }

    public void setMobTel(String mobTel) {
        this.mobTel = mobTel == null ? null : mobTel.trim();
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName == null ? null : corpName.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise == null ? null : expertise.trim();
    }

    public String getRegOrg() {
        return regOrg;
    }

    public void setRegOrg(String regOrg) {
        this.regOrg = regOrg == null ? null : regOrg.trim();
    }

    public String getBizOrg() {
        return bizOrg;
    }

    public void setBizOrg(String bizOrg) {
        this.bizOrg = bizOrg == null ? null : bizOrg.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName == null ? null : officeName.trim();
    }

    public String getCorpCode() {
        return corpCode;
    }

    public void setCorpCode(String corpCode) {
        this.corpCode = corpCode == null ? null : corpCode.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode == null ? null : employeeCode.trim();
    }

    public String getIsextract() {
        return isextract;
    }

    public void setIsextract(String isextract) {
        this.isextract = isextract == null ? null : isextract.trim();
    }
    
    
    
}
