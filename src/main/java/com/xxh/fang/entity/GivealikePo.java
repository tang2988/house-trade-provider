package com.xxh.fang.entity;

import java.util.Date;

public class GivealikePo  {
	
	


	/**
	 * 点赞ID
	 */
	public Long zanId;
	/**
	 * 产品id
	 */
	public Long product_id;
	/**
	 * 客户id
	 */
	public Long customerId;
	/**
	 * 点赞时间
	 */
	public Date pointOfTime;
	/**
	 * 状态 10点赞 20举报
	 */
	public Integer status;
	public Long getZanId() {
		return zanId;
	}
	public void setZanId(Long zanId) {
		this.zanId = zanId;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Date getPointOfTime() {
		return pointOfTime;
	}
	public void setPointOfTime(Date pointOfTime) {
		this.pointOfTime = pointOfTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String toString() {
		return "GivealikePo [zanId=" + zanId + ", product_id=" + product_id + ", customerId=" + customerId
				+ ", pointOfTime=" + pointOfTime + ", status=" + status + "]";
	}
	
	
	
	

}
