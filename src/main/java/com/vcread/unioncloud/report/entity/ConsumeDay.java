package com.vcread.unioncloud.report.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vcread.unioncloud.utils.IdGen;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 日账单
 * @author youq
 * 
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "s_consume_day")
public class ConsumeDay {

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
	 * 消费总金额￥
	 */
	private Double consumeSum;
	
	/**
	 * 当日短信发送条数
	 */
	private Integer msgCount;
	
	/**
	 * 单日短信发送失败条数
	 */
	private Integer msgFailCount;
	
	/**
	 * 单日短信消费金额￥
	 */
	private Double msgMoney;
	
	/**
	 * 群发短信发送量
	 */
	private Integer massMsgCount;

	/**
	 * 群发短信发送失败量
	 */
	private Integer massMsgFailCount;

	/**
	 * 群发短信消费金额￥
	 */
	private Double massMsgMoney;

	/**
	 * 语音验证码发送量
	 */
	private Integer voiceVcCount;

	/**
	 * 语音验证码发送失败量
	 */
	private Integer voiceVcFailCount;

	/**
	 * 语音验证码消费金额￥
	 */
	private Double voiceVcMoney;

	/**
	 * 语音通话时长（秒）
	 */
	private Long voiceCount;

	/**
	 * 语音通话消费金额￥
	 */
	private Double voiceMoney;

	/**
	 * 双向回呼时长（秒）
	 */
	private Long bothwayCallCount;

	/**
	 * 双向回呼消费金额￥
	 */
	private Double bothwayCallMoney;

	/**
	 * 语音通知发送量
	 */
	private Integer voiceNoticeCount;

	/**
	 * 语音通知发送失败条数
	 */
	private Integer voiceNoticeFailCount;

	/**
	 * 语音通知消费金额
	 */
	private Double voiceNoticeMoney;

	/**
	 * 使用流量(MB)
	 */
	private Integer trafficMB;

	/**
	 * (流量相关预留字段,暂无明确定义)
	 */
	private Double trafficMoney;

	/**
	 * 安全号码使用时长
	 */
	private Integer numberDefenderCount;

	/**
	 * 安全号码消费金额
	 */
	private Double numberDefenderMoney;

	/**
	 * 电话会议使用时长
	 */
	private Long teleconferenceCallCount;

	/**
	 * 电话会议消费金额
	 */
	private Double teleconferenceCallMoney;

}