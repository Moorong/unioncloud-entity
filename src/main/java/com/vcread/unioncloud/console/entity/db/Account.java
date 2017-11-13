package com.vcread.unioncloud.console.entity.db;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**   
 * @Title: Account.java 
 * @Package com.vcread.unioncloud.console.entity.db 
 * @Description: 商户表
 * @author liu dong jie
 * @date 2017年8月28日 上午11:27:40 
 * @version V1.0   
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update account set remove=true,last_modified=now() where id=?")
public class Account extends Base {

	/**
	 * @Fields user : 用户
	 */
	@OneToOne
	private User user;

	/**
	 * @Fields token : 令牌
	 */
	private String token;

	/**
	 * @Fields companyName : 公司名称
	 */
	private String companyName;

	/**
	 * @Fields address : 地址
	 */
	private String address;

	/**
	 * @Fields businessLicenseUrl : 营业执照
	 */
	private String businessLicenseUrl;

	/**
	 * @Fields accountCertificateUrl : 商户证明
	 */
	private String accountCertificateUrl;

	/**
	 * @Fields otherCertificateUrl : 其他证明
	 */
	private String otherCertificateUrl;

	/**
	 * @Fields primaryAccountAmount : 主账户金额
	 */
	private Double primaryAccountAmount;

	/**
	 * @Fields deputyAccountAmount : 副账户金额
	 */
	private Double deputyAccountAmount;

	/**
	 * 会议流程id
	 */
	private String conferenceProcessId;

	/**
	 * 接入号码
	 */
	private String accessNumber;

}