package com.vcread.unioncloud.console.entity.db;

import com.vcread.unioncloud.console.entity.enu.OnlineType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

/**
 * @Title: App.java
 * @Package com.vcread.unioncloud.console.entity.db
 * @Description: 应用表
 * @author liu dong jie
 * @date 2017年8月28日 上午11:28:55
 * @version V1.0
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
// @ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update app set remove=true,last_modified=now() where id=?")
public class App extends Base {

	/**
	 * @Fields account :商户
	 */
	@ManyToOne
	private Account account;

	/**
	 * @Fields token :应用token
	 */
	private String token;


	/**
	 * @Fields name :名称
	 */
	private String name;

	/**
	 * @Fields status :状态
	 */
	@Enumerated(EnumType.STRING)
	private OnlineType status;

	/**
	 * @Fields quota :额度 不限制 -1
	 */
	private Double quota;

	/**
	 * @Fields bindIp : 绑定IP 以逗号分隔 如果为空就说明未绑定ip
	 */
	private String bindIp;

	/**
	 * @Fields callbackUrl :回调地址
	 */
	private String callbackUrl;

	@OneToMany(mappedBy="app")
	private List<AppFunction> appFunctions;

}