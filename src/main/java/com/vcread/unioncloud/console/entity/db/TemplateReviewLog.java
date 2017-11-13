package com.vcread.unioncloud.console.entity.db;

import com.vcread.unioncloud.console.entity.enu.MsgTemplateReviewStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedBy;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

/**   
 * @Title: TemplateReviewLog.java 
 * @Package com.vcread.unioncloud.console.entity.db 
 * @Description: 模板审核记录表
 * @author liu dong jie
 * @date 2017年8月28日 上午11:34:45 
 * @version V1.0   
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update template_review_log set remove=true,last_modified=now() where id=?")
public class TemplateReviewLog extends Base {

	/**
	 * 模板
	 */
	@ManyToOne
	private MsgTemplate msgTemplate;

	/**z
	 * 在线状态 1: 待审核 2: 已通过 3: 已驳回 4: 已删除 5: 待发送 6: 发送中 7: 已发送 8: 发送成功 9: 发送失败
	 */
	@Enumerated(EnumType.STRING)
	private MsgTemplateReviewStatus status;

	/**
	 * 操作人
	 */
	@CreatedBy
	@ManyToOne
	private User user;

	/**
	 * 状态改变说明
	 */
	private String description;

}