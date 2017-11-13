package com.vcread.unioncloud.console.entity.db;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedBy;

import com.vcread.unioncloud.console.entity.enu.EmailTemplateType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

 /**
  * @Description: 邮件模板表
  * @Date: 2017/9/19 12:02
  * @Author: panliyong
  */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update email_template set remove=true,last_modified=now() where id=?")
public class EmailTemplate extends Base {


    /**
     * 邮件标题
     */
    private String title;

    /**
     * 邮件正文
     */
    private String body;
    
    /**
     * 邮件模板类型
     */
    @Enumerated(value=EnumType.STRING)
    private EmailTemplateType type;

}