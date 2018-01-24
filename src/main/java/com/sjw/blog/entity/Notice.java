package com.sjw.blog.entity;

import java.io.Serializable;
import java.util.Date;

public class Notice implements Serializable {
    private Integer noticeId;

    private String noticeTitle;

    private String noticeContent;

    private Date noticeCreateTime;

    private Date noticeUpdateTime;

    private Integer noticeStatus;

    private Integer noticeOrder;

    private static final long serialVersionUID = 1L;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent == null ? null : noticeContent.trim();
    }

    public Date getNoticeCreateTime() {
        return noticeCreateTime;
    }

    public void setNoticeCreateTime(Date noticeCreateTime) {
        this.noticeCreateTime = noticeCreateTime;
    }

    public Date getNoticeUpdateTime() {
        return noticeUpdateTime;
    }

    public void setNoticeUpdateTime(Date noticeUpdateTime) {
        this.noticeUpdateTime = noticeUpdateTime;
    }

    public Integer getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(Integer noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    public Integer getNoticeOrder() {
        return noticeOrder;
    }

    public void setNoticeOrder(Integer noticeOrder) {
        this.noticeOrder = noticeOrder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", noticeId=").append(noticeId);
        sb.append(", noticeTitle=").append(noticeTitle);
        sb.append(", noticeContent=").append(noticeContent);
        sb.append(", noticeCreateTime=").append(noticeCreateTime);
        sb.append(", noticeUpdateTime=").append(noticeUpdateTime);
        sb.append(", noticeStatus=").append(noticeStatus);
        sb.append(", noticeOrder=").append(noticeOrder);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}