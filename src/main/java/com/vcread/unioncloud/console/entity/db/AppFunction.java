package com.vcread.unioncloud.console.entity.db;

import com.vcread.unioncloud.console.entity.enu.BusinessType;
import com.vcread.unioncloud.console.entity.enu.FunctionType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

/**
 * @Title: AppFunction.java
 * @Package com.vcread.unioncloud.console.entity.db
 * @Description:应用开启的功能
 * @author liu dong jie
 * @date 2017年8月28日 上午11:31:37
 * @version V1.0
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update application_function set remove=true,last_modified=now() where id=?")
public class AppFunction extends Base {

	/**
	 * 应用
	 */
	@ManyToOne
	private App app;

	/**
	 * 功能标识符 1: 短信模板 2: 群发短信 3: 语音验证码 4: 语音通话
	 */
	@Enumerated(EnumType.STRING)
	private BusinessType businessType;

	/** 
	 * @Fields functionType :功能开启
	 */ 
	@Enumerated(EnumType.STRING)
	private FunctionType functionType;
	/**
	 * @Fields ips :产品绑定的 IP 以逗号分隔
	 */
	private String ips;
}