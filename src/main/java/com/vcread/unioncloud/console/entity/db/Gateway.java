package com.vcread.unioncloud.console.entity.db;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;

import com.vcread.unioncloud.convert.OperatorTypeConvert;
import com.vcread.unioncloud.console.entity.enu.OperatorType;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author liu dong jie
 * @version V1.0
 * @Title: Gateway.java
 * @Package com.vcread.unioncloud.console.entity.db
 * @Description: 渠道网关表
 * @date 2017年8月28日 上午11:33:18
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update gateway set remove=true,last_modified=now() where id=?")
public class Gateway extends Base {

    /**
     * 主机
     */
    private String host;

    /**
     * 端口
     */
    private int port;

    /**
     * 节点名称
     */
    private String name;

    /**
     * 运营商类型
     * 中国移动 cmcc ,中国电信 ctcc ,中国联通 cucc
     */
    @Convert(converter = OperatorTypeConvert.class)
    @Column
    private OperatorType operatorType;

    /**
     * 最大并发限制
     */
    private int rateLimit;

    /**
     * 每条单价
     */
    private double price;

    /**
     * 发送短信前缀
     */
    private String sendPhonePrefix;

    /**
     * 短信长度的限制
     */
    private int lengthLimit;

    /**
     * 所属地区
     */
    private String areaId;
    
    public Gateway(){}

    public Gateway(String host, int port) {
        setId(host + ":" + port);
    }
}