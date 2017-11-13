package com.vcread.unioncloud.console.entity.db;

import com.vcread.unioncloud.console.entity.enu.VoiceNoticeStatus;
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
 * <B>Description:</B>语音通知审核log<br>
 * <B>Create on:</B>2017/10/17<br>
 *
 * @author xidong.chen
 */

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update voice_notice_review_log set remove=true,last_modified=now() where id=?")
public class VoiceNoticeReviewLog extends Base{

    /**
     *语音通知
     */
    @ManyToOne
    private VoiceNotice voiceNotice;

    /**
     * 语音通知状态
     */
    @Enumerated(EnumType.STRING)
    private VoiceNoticeStatus status;

    /**
     * 操作人
     */
    @CreatedBy
    @ManyToOne
    private User user;

    /**
     * 状态改变说明
     */
    private String description;


}
