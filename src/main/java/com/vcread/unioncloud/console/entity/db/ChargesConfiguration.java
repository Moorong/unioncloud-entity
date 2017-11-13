package com.vcread.unioncloud.console.entity.db;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

/**   
 * @Title: ChargesConfiguration.java 
 * @Package com.vcread.unioncloud.console.entity.db 
 * @Description:资费配置表
 * @author liu dong jie
 * @date 2017年8月28日 上午11:33:03 
 * @version V1.0   
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update charges_configuration set remove=true,last_modified=now() where id=?")
public class ChargesConfiguration extends Base {

    /**
     * 商户
     */
    @ManyToOne
    private Account account;

    /**
     * 开始时间
     */
    private LocalDateTime beginTime;

    /**
     * 结束时间
     */
    private LocalDateTime overTime;

    /**
     * 短信资费
     */
    private Double msgPrice;

    /**
     * 语音通话
     */
    private Double voiceCallPrice;

    /**
     * 语音通话单位秒数
     */
    private Integer voiceCallSecond;

    /**
     * 双向回呼
     */
    private Double bidirectionalCallPrice;

    /**
     * 双向回呼单位秒数
     */
    private Integer bidirectionalCallSecond;

    /**
     * 语音通知
     */
    private Double voiceNoticePrice;

    /**
     * 安全号码
     */
    private Double numberDefenderCallPrice;

    /**
     * 安全号码单位秒数
     */
    private Integer numberDefenderCallSecond;

    /**
     * 流量包
     */
    private Double trafficPrice;

    /**
     * 语音验证码
     */
    private Double voiceCodePrice;


}