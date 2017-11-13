package com.vcread.unioncloud.console.entity.db;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**   
 * @Title: Role.java 
 * @Package com.vcread.unioncloud.console.entity.db 
 * @Description:后台角色表
 * @author liu dong jie
 * @date 2017年8月28日 上午11:35:07 
 * @version V1.0   
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update role set remove=true,last_modified=now() where id=?")
public class Role extends Base {

	/**
	 * 角色名称
	 */
	private String name;

	/**
	 * 角色描述
	 */
	private String description;

	/**
	 * 授权的资源
	 */
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Resource> resources;

}