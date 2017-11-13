package com.vcread.unioncloud.console.entity.db;

import com.vcread.unioncloud.console.entity.enu.MsgTemplateReviewStatus;
import com.vcread.unioncloud.console.entity.enu.TemplateUseStatus;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

/**   
 * @Title: MsgTemplate.java 
 * @Package com.vcread.unioncloud.console.entity.db 
 * @Description:短信模板表
 * @author liu dong jie
 * @date 2017年8月28日 上午11:34:18 
 * @version V1.0   
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update msg_template set remove=true,last_modified=now() where id=?")
public class MsgTemplate extends Base {

	/**
	 * 应用
	 */
	@ManyToOne
	private App app;

	/**
	 * 审核记录
	 */
	@OneToOne
	private TemplateReviewLog lastTemplateReviewLog;

	/**
	 * 模板名称
	 */
	private String name;

	/**
	 * 模板内容
	 */
	@Column(columnDefinition="TEXT")
	private String content;

	/**
	 * 短信签名
	 */
	private String sign;

	/**
	 * 操作人
	 */
	@ManyToOne
	private User user;

	/**
	 * 审核状态  toReview :待审核  approved :已通过  disapproved :已驳回
	 */
	@Enumerated(EnumType.STRING)
	private MsgTemplateReviewStatus reviewStatus;

	/**
	 * 使用状态 used:使用过 unused:未使用
	 */
	@Enumerated(EnumType.STRING)
	private TemplateUseStatus usedStatus;

}