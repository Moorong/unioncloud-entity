package com.vcread.unioncloud.console.entity.db;

import com.vcread.unioncloud.console.entity.enu.AccountType;
import com.vcread.unioncloud.console.entity.enu.RechargeStatus;
import com.vcread.unioncloud.console.entity.enu.RechargeType;
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
import java.time.LocalDateTime;

/**   
 * @Title: AccountRechargeRecord.java 
 * @Package com.vcread.unioncloud.console.entity.db 
 * @Description:商户账户充值记录
 * @author liu dong jie
 * @date 2017年8月28日 上午11:30:21 
 * @version V1.0   
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update account_recharge_record set remove=true,last_modified=now() where id=?")
public class AccountRechargeRecord extends Base {

	/** 
	 * @Fields account :商户
	 */ 
	@ManyToOne
	private Account account;

	/** 
	 * @Fields amount :充值金额
	 */ 
	private double amount;

	/** 
	 * @Fields user :操作人员ID
	 */ 
	@CreatedBy
	@ManyToOne
	private User user;

	/** 
	 * @Fields scanningUrl :到账扫描件
	 */ 
	private String scanningUrl;

	/** 
	 * @Fields payType :
	 */
	@Enumerated(EnumType.STRING)
	private RechargeType payType;

	/** 
	 * @Fields rechargeStatus :付款狀態
	 * toPay :待付款
	 * paymentSuccess : 充值成功
	 * paymentFailure : 充值失败
	 */ 
	@Enumerated(EnumType.STRING)
	private RechargeStatus rechargeStatus;

	/**
	 * @Fields accountType :账户类型 1: 主账户 2: 副账户
	 */
	@Enumerated(EnumType.STRING)
	private AccountType accountType;

	/** 
	 * @Fields description :备注
	 */ 
	private String description;

	/** 
	 * @Fields rechargeTime :充值时间
	 */ 
	private LocalDateTime rechargeTime;

	/**
	 * @Fields orderName :订单名称
	 */
	private String orderName;



}