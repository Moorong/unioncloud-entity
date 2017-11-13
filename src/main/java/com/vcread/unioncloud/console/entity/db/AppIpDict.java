package com.vcread.unioncloud.console.entity.db;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;

/**
 * @author panliyong
 * @Description: 应用和Ip的对应关心表
 * @create 2017/9/3 10:34
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update app_ip_dict set remove=true,last_modified=now() where id=?")
public class AppIpDict extends Base{
    /**
     * 商户ID
     */
    private String accountId;
    /**
     * 应用Id
     */
    private String appId;
    /**
     * 对应的IP
     */
    private String ip;
}
