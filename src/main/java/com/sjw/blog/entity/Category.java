package com.sjw.blog.entity;

import java.io.Serializable;

public class Category implements Serializable {
    private Integer categoryId;

    private Integer categoryPid;

    private String categoryName;

    private String categoryDescription;

    private Integer categoryOrder;

    private String categoryIcon;

    private Integer categoryStatus;

    private static final long serialVersionUID = 1L;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCategoryPid() {
        return categoryPid;
    }

    public void setCategoryPid(Integer categoryPid) {
        this.categoryPid = categoryPid;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription == null ? null : categoryDescription.trim();
    }

    public Integer getCategoryOrder() {
        return categoryOrder;
    }

    public void setCategoryOrder(Integer categoryOrder) {
        this.categoryOrder = categoryOrder;
    }

    public String getCategoryIcon() {
        return categoryIcon;
    }

    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon == null ? null : categoryIcon.trim();
    }

    public Integer getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(Integer categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", categoryId=").append(categoryId);
        sb.append(", categoryPid=").append(categoryPid);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", categoryDescription=").append(categoryDescription);
        sb.append(", categoryOrder=").append(categoryOrder);
        sb.append(", categoryIcon=").append(categoryIcon);
        sb.append(", categoryStatus=").append(categoryStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}