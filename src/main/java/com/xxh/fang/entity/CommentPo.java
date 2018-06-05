package com.xxh.fang.entity;

import java.io.Serializable;
import java.util.Date;

public class CommentPo implements Serializable {

	/**
	 * 
	 */
	public static final long serialVersionUID = -5510578543294447829L;

	/**
	 * 评论id
	 */
	public Long commentOnID;

	/**
	 * 评论人
	 */
	public String commentOnPeople;

	/**
	 * 内容
	 */
	public String content;

	/**
	 * 评论时间
	 */
	public Date commentOfTime;

	/**
	 * 产品id
	 */
	public Long product_id;
	/**
	 * 回帖id
	 */
	public Long repostId;

	/**
	 * 点赞数
	 */
	public Long pointOfpraise;

	public CommentPo() {
	}

	public Long getCommentOnID() {
		return commentOnID;
	}

	public void setCommentOnID(Long commentOnID) {
		this.commentOnID = commentOnID;
	}

	public String getCommentOnPeople() {
		return commentOnPeople;
	}

	public void setCommentOnPeople(String commentOnPeople) {
		this.commentOnPeople = commentOnPeople;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCommentOfTime() {
		return commentOfTime;
	}

	public void setCommentOfTime(Date commentOfTime) {
		this.commentOfTime = commentOfTime;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public Long getRepostId() {
		return repostId;
	}

	public void setRepostId(Long repostId) {
		this.repostId = repostId;
	}

	public Long getPointOfpraise() {
		return pointOfpraise;
	}

	public void setPointOfpraise(Long pointOfpraise) {
		this.pointOfpraise = pointOfpraise;
	}

	public String toString() {
		return "CommentPo [commentOnID=" + commentOnID + ", commentOnPeople=" + commentOnPeople + ", content=" + content
				+ ", commentOfTime=" + commentOfTime + ", product_id=" + product_id + ", repostId=" + repostId
				+ ", pointOfpraise=" + pointOfpraise + "]";
	}

}
