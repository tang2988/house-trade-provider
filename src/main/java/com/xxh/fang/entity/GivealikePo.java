package com.xxh.fang.entity;

import java.io.Serializable;
import java.util.Date;

public class GivealikePo implements Serializable {
	
	
	/**
	 * 
	 */
	public  static final long serialVersionUID = -3634003259781405355L;
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
	
	

}
