package com.sjw.blog.entity;

import java.io.Serializable;
import java.util.Date;

public class Page implements Serializable {
    private Integer pageId;

    private String pageKey;

    private String pageTitle;

    private Date pageCreateTime;

    private Date pageUpdateTime;

    private Integer pageViewCount;

    private Integer pageCommentCount;

    private Integer pageStatus;

    private String pageContent;

    private static final long serialVersionUID = 1L;

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public String getPageKey() {
        return pageKey;
    }

    public void setPageKey(String pageKey) {
        this.pageKey = pageKey == null ? null : pageKey.trim();
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle == null ? null : pageTitle.trim();
    }

    public Date getPageCreateTime() {
        return pageCreateTime;
    }

    public void setPageCreateTime(Date pageCreateTime) {
        this.pageCreateTime = pageCreateTime;
    }

    public Date getPageUpdateTime() {
        return pageUpdateTime;
    }

    public void setPageUpdateTime(Date pageUpdateTime) {
        this.pageUpdateTime = pageUpdateTime;
    }

    public Integer getPageViewCount() {
        return pageViewCount;
    }

    public void setPageViewCount(Integer pageViewCount) {
        this.pageViewCount = pageViewCount;
    }

    public Integer getPageCommentCount() {
        return pageCommentCount;
    }

    public void setPageCommentCount(Integer pageCommentCount) {
        this.pageCommentCount = pageCommentCount;
    }

    public Integer getPageStatus() {
        return pageStatus;
    }

    public void setPageStatus(Integer pageStatus) {
        this.pageStatus = pageStatus;
    }

    public String getPageContent() {
        return pageContent;
    }

    public void setPageContent(String pageContent) {
        this.pageContent = pageContent == null ? null : pageContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pageId=").append(pageId);
        sb.append(", pageKey=").append(pageKey);
        sb.append(", pageTitle=").append(pageTitle);
        sb.append(", pageCreateTime=").append(pageCreateTime);
        sb.append(", pageUpdateTime=").append(pageUpdateTime);
        sb.append(", pageViewCount=").append(pageViewCount);
        sb.append(", pageCommentCount=").append(pageCommentCount);
        sb.append(", pageStatus=").append(pageStatus);
        sb.append(", pageContent=").append(pageContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}