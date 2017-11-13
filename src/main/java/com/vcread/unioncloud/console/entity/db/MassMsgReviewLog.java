package com.vcread.unioncloud.console.entity.db;

import com.vcread.unioncloud.console.entity.enu.MassMsgStatus;
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

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update mass_msg_review_log set remove=true,last_modified=now() where id=?")
public class MassMsgReviewLog extends Base {

	/**
	 * 模板
	 */
	@ManyToOne
	private MassMsg massMsg;

	/**z
	 * 在线状态 1: 待审核 2: 已通过 3: 已驳回 4: 已删除 5: 待发送 6: 发送中 7: 已发送 8: 发送成功 9: 发送失败
	 */
	@Enumerated(EnumType.STRING)
	private MassMsgStatus status;

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