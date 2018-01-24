package com.sjw.blog.entity;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    private Integer articleId;

    private Integer articleUserId;

    private String articleTitle;

    private Integer articleParentCategoryId;

    private Integer articleChildCategoryId;

    private String articleTagIds;

    private Integer articleViewCount;

    private Integer articleCommentCount;

    private Integer articleLikeCount;

    private Date articlePostTime;

    private Date articleUpdateTime;

    private Integer articleIsComment;

    private Integer articleStatus;

    private Integer articleOrder;

    private String articleContent;

    private static final long serialVersionUID = 1L;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getArticleUserId() {
        return articleUserId;
    }

    public void setArticleUserId(Integer articleUserId) {
        this.articleUserId = articleUserId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Integer getArticleParentCategoryId() {
        return articleParentCategoryId;
    }

    public void setArticleParentCategoryId(Integer articleParentCategoryId) {
        this.articleParentCategoryId = articleParentCategoryId;
    }

    public Integer getArticleChildCategoryId() {
        return articleChildCategoryId;
    }

    public void setArticleChildCategoryId(Integer articleChildCategoryId) {
        this.articleChildCategoryId = articleChildCategoryId;
    }

    public String getArticleTagIds() {
        return articleTagIds;
    }

    public void setArticleTagIds(String articleTagIds) {
        this.articleTagIds = articleTagIds == null ? null : articleTagIds.trim();
    }

    public Integer getArticleViewCount() {
        return articleViewCount;
    }

    public void setArticleViewCount(Integer articleViewCount) {
        this.articleViewCount = articleViewCount;
    }

    public Integer getArticleCommentCount() {
        return articleCommentCount;
    }

    public void setArticleCommentCount(Integer articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    public Integer getArticleLikeCount() {
        return articleLikeCount;
    }

    public void setArticleLikeCount(Integer articleLikeCount) {
        this.articleLikeCount = articleLikeCount;
    }

    public Date getArticlePostTime() {
        return articlePostTime;
    }

    public void setArticlePostTime(Date articlePostTime) {
        this.articlePostTime = articlePostTime;
    }

    public Date getArticleUpdateTime() {
        return articleUpdateTime;
    }

    public void setArticleUpdateTime(Date articleUpdateTime) {
        this.articleUpdateTime = articleUpdateTime;
    }

    public Integer getArticleIsComment() {
        return articleIsComment;
    }

    public void setArticleIsComment(Integer articleIsComment) {
        this.articleIsComment = articleIsComment;
    }

    public Integer getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(Integer articleStatus) {
        this.articleStatus = articleStatus;
    }

    public Integer getArticleOrder() {
        return articleOrder;
    }

    public void setArticleOrder(Integer articleOrder) {
        this.articleOrder = articleOrder;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleId=").append(articleId);
        sb.append(", articleUserId=").append(articleUserId);
        sb.append(", articleTitle=").append(articleTitle);
        sb.append(", articleParentCategoryId=").append(articleParentCategoryId);
        sb.append(", articleChildCategoryId=").append(articleChildCategoryId);
        sb.append(", articleTagIds=").append(articleTagIds);
        sb.append(", articleViewCount=").append(articleViewCount);
        sb.append(", articleCommentCount=").append(articleCommentCount);
        sb.append(", articleLikeCount=").append(articleLikeCount);
        sb.append(", articlePostTime=").append(articlePostTime);
        sb.append(", articleUpdateTime=").append(articleUpdateTime);
        sb.append(", articleIsComment=").append(articleIsComment);
        sb.append(", articleStatus=").append(articleStatus);
        sb.append(", articleOrder=").append(articleOrder);
        sb.append(", articleContent=").append(articleContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}