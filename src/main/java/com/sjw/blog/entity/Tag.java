package com.sjw.blog.entity;

import java.io.Serializable;

public class Tag implements Serializable {
    private Integer tagId;

    private String tagName;

    private String tagDescription;

    private Integer tagStatus;

    private static final long serialVersionUID = 1L;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public String getTagDescription() {
        return tagDescription;
    }

    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription == null ? null : tagDescription.trim();
    }

    public Integer getTagStatus() {
        return tagStatus;
    }

    public void setTagStatus(Integer tagStatus) {
        this.tagStatus = tagStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tagId=").append(tagId);
        sb.append(", tagName=").append(tagName);
        sb.append(", tagDescription=").append(tagDescription);
        sb.append(", tagStatus=").append(tagStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}