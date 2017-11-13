package com.vcread.unioncloud.console.entity.db;

import com.vcread.unioncloud.console.entity.enu.OnlineType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedBy;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

/**   
 * @Title: ApplicationReviewLog.java 
 * @Package com.vcread.unioncloud.console.entity.db 
 * @Description: 应用上下线记录表
 * @author liu dong jie
 * @date 2017年8月28日 上午11:32:06 
 * @version V1.0   
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update application_review_log set remove=true,last_modified=now() where id=?")
public class ApplicationReviewLog extends Base {

    /**
     * 应用
     */
    @ManyToOne
    private App app;

    /**
     * 在线状态
     */
    @Enumerated(EnumType.STRING)
    private OnlineType status;

    /**
     * 操作人ID
     */
    @CreatedBy
    @ManyToOne
    private User user;

    /**
     * 状态改变说明
     */
    private String description;

}