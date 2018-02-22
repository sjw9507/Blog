package com.sjw.blog.entity;
/**
* @author Jiawei Shi
* @version 创建时间：2018年2月22日 下午4:56:30
*
*/
public class CommentCustom extends Comment {
	//评论者的头像
    private String commentAuthorAvatar;

    public String getCommentAuthorAvatar() {
        return commentAuthorAvatar;
    }

    public void setCommentAuthorAvatar(String commentAuthorAvatar) {
        this.commentAuthorAvatar = commentAuthorAvatar;
    }
}
