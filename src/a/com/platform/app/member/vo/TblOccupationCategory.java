package com.platform.app.member.vo;

import java.util.Date;

public class TblOccupationCategory {
    private Integer id;

    private String bigCategory;

    private String bigCategoryName;

    private String mediumCategory;

    private String mediumCategoryName;

    private String smallCategory;

    private String smallCategoryName;

    private String type;

    private String creator;

    private Date createTime;

    private String modifier;

    private Date modifierTime;

    private String flag;

    private String batchNumber;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBigCategory() {
        return bigCategory;
    }

    public void setBigCategory(String bigCategory) {
        this.bigCategory = bigCategory == null ? null : bigCategory.trim();
    }

    public String getBigCategoryName() {
        return bigCategoryName;
    }

    public void setBigCategoryName(String bigCategoryName) {
        this.bigCategoryName = bigCategoryName == null ? null : bigCategoryName.trim();
    }

    public String getMediumCategory() {
        return mediumCategory;
    }

    public void setMediumCategory(String mediumCategory) {
        this.mediumCategory = mediumCategory == null ? null : mediumCategory.trim();
    }

    public String getMediumCategoryName() {
        return mediumCategoryName;
    }

    public void setMediumCategoryName(String mediumCategoryName) {
        this.mediumCategoryName = mediumCategoryName == null ? null : mediumCategoryName.trim();
    }

    public String getSmallCategory() {
        return smallCategory;
    }

    public void setSmallCategory(String smallCategory) {
        this.smallCategory = smallCategory == null ? null : smallCategory.trim();
    }

    public String getSmallCategoryName() {
        return smallCategoryName;
    }

    public void setSmallCategoryName(String smallCategoryName) {
        this.smallCategoryName = smallCategoryName == null ? null : smallCategoryName.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getModifierTime() {
        return modifierTime;
    }

    public void setModifierTime(Date modifierTime) {
        this.modifierTime = modifierTime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber == null ? null : batchNumber.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}