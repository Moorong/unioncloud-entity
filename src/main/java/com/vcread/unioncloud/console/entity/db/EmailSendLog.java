package com.vcread.unioncloud.console.entity.db;

import com.vcread.unioncloud.console.entity.enu.EmailSendStatus;
import com.vcread.unioncloud.console.entity.enu.EmailTemplateType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;

/**
 * @author panliyong
 * @Description: 邮件发送日志
 * @create 2017/9/19 18:12
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update email_send_log set remove=true,last_modified=now() where id=?")
public class EmailSendLog extends Base {

    /**
     * 发送邮箱模板Id
     */
    private String templateId;
    
    /**
     * 发送邮箱地址
     */
    private String sender;

    /**
     * 接收邮箱地址
     */
    private String receiver;

    /**
     * 抄送邮箱地址
     */
    private String CC;

    /**
     * 抄送邮箱地址
     */
    private String BCC;

    /**
     * 发送结果
     */
    private EmailSendStatus status;
    
}
