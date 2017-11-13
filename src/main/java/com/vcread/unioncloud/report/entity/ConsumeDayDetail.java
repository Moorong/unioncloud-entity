package com.vcread.unioncloud.report.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vcread.unioncloud.utils.IdGen;

import lombok.Data;

/** 
* @author 作者 youq: 
* @version 创建时间：2017年9月1日 上午11:39:40 
* 类说明 
*/
@Data
@Entity
@Table(name = "s_consume_day_detail")
public class ConsumeDayDetail {
	
	/**
	 * id
	 */
	@Id
	@Column(length = 50)
	private String id = IdGen.DEFAULT.gen();

	/**
	 * 统计时间 yyyy-MM-dd
	 */
	private String statTime;
	
	/**
	 * 商户id
	 */
	private String accountId;
	
	/**
	 * 应用id
	 */
	private String applicationId;
	
	/**
	 * 产品类型（0，模板短信；1，群发短信；2，语音验证码；3，语音通话；4，语音通知；5，双向回呼；6，语音通知；7，安全号码；8，电话会议；9，流量包）
	 */
	private Integer productType;
	
	/**
	 * 产品使用次数或时长
	 */
	private Integer consumeCount;

	/**
	 * 短信/通知/验证码发送失败次数
	 */
	private Integer consumeFailCount;
	
	/**
	 * 使用产品消费金额
	 */
	private Double consumeMoney;
}
