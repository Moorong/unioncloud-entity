package com.vcread.unioncloud.console.entity.db;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**   
 * @Title: AccountContactInfo.java 
 * @Package com.vcread.unioncloud.console.entity.db 
 * @Description: 商户的其他联系信息表
 * @author liu dong jie
 * @date 2017年8月28日 上午11:29:29 
 * @version V1.0   
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update account_contact_info set remove=true,last_modified=now() where id=?")
public class AccountContactInfo extends Base {

	/** 
	 * @Fields account :商户
	 */ 
	@ManyToOne
	private Account account;

	/** 
	 * @Fields type : 联系类型
	 */ 
	private String type;

	/** 
	 * @Fields content :联系方式内容
	 */ 
	private String content;

}