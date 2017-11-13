package com.vcread.unioncloud.console.entity.db;

import com.vcread.unioncloud.console.entity.enu.AccountStatus;
import com.vcread.unioncloud.console.entity.enu.UserType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

/**
 * @author liu dong jie
 * @version V1.0
 * @Title: User.java
 * @Package com.vcread.unioncloud.console.entity.db
 * @Description:后台用户表
 * @date 2017年8月28日 上午11:35:24
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update user set remove=true,last_modified=now() where id=?")
public class User extends Base {
    // /**
    //  * 商户
    //  */
    // @OneToOne
    // private Account account;
    /**
     * 用户名
     */
    private String userName;

    /**
     * 联系手机
     */
    private String phoneNumber;

    /**
     * 联系邮箱
     */
    private String email;

    /**
     * 用户描述
     */
    private String description;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户状态是否冻结
     */
    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    /**
     * 1: 商户 2: 后台用户
     */
    @Enumerated(EnumType.STRING)
    private UserType userType;

    /**
     * 拥有角色的列表
     */
    @ManyToOne
    private Role role;
}