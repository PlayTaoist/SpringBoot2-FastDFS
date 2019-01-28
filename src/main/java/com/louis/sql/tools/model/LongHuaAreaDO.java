/**   
 * @author lr
 * @date 2018年12月26日 下午6:32:48 
 * @version V1.0.0   
 */
package com.louis.sql.tools.model;

import java.io.Serializable;
import java.util.Date;

public class LongHuaAreaDO implements Serializable{

    private static final long serialVersionUID = -4277023292843262708L;

    private String id;

    private String cerNo;

    private String legalNo;

    private String name;

    private String sex;

    private String mobTel;

    private String corpName;

    private String deptName;

    private String post;

    private String expertise;

    private String regOrg;

    private String bizOrg;

    private Date updateTime;

    private String officeName;

    private String corpCode;

    private String deptCode;

    private Date createTime;

    private String employeeCode;

    private String isextract;

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
