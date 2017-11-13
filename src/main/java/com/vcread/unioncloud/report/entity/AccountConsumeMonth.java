package com.vcread.unioncloud.report.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import com.vcread.unioncloud.console.entity.db.Account;
import com.vcread.unioncloud.console.entity.db.Base;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/** 
* @author 作者 youq: 
* @version 创建时间：2017年9月2日 下午2:14:28 
* 类说明 
*/
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name="s_account_consume_month")
@Where(clause = "remove=false")
@SQLDelete(sql = "update s_account_consume_month set remove=true,last_modified=now() where id=?")
public class AccountConsumeMonth extends Base {

	/**
	 * @Fields accountId :商户id
	 */
	private String accountId;
	
	/**
	 * 统计时间 yyyy-MM
	 */
	private String statTime;
	
	/**
	 * 账户类型  	primary:主账号|deputy:副账户
	 */
	private String accountType;
	
	/**
	 * 账户余额
	 */
	private Double accountBalance;

	/**
	 * 本月扣费
	 */
	private Double currMonthCost;

	/**
	 * 上月结余
	 */
	private Double lastMonthCost;

	/**
	 * 本月充值
	 */
	private Double currMonthRecharge;

}
