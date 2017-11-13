package com.vcread.unioncloud.console.entity.db;

import com.vcread.unioncloud.console.entity.enu.TemplateUseStatus;
import com.vcread.unioncloud.console.entity.enu.VoiceNoticeStatus;
import com.vcread.unioncloud.console.entity.enu.VoiceNoticeType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * <B>Description:</B>语音通知Entity<br>
 * <B>Create on:</B>2017/10/17<br>
 *
 * @author xidong.chen
 */

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update voice_notice set remove=true,last_modified=now() where id=?")
public class VoiceNotice extends Base{

    /**
     * 应用Id
     */
    @ManyToOne
    private App app;

    /**
     * 语音名称
     */
    private String name;

    /**
     * 语音文本内容|语音文件地址
     */
    @Column(columnDefinition="TEXT")
    private String content;

    /**
     * 语音通知类型
     */
    @Enumerated(EnumType.STRING)
    private VoiceNoticeType type;

    /**
     * 语音通知状态
     */
    @Enumerated(EnumType.STRING)
    private VoiceNoticeStatus   reviewStatus;

    /**
     * 创建人
     */
    @ManyToOne
    private User createUser;

    /**
     * 语音通知审核log
     */
    @OneToOne
    private VoiceNoticeReviewLog voiceNoticeReviewLog;

    /**
     *
     */
    @Enumerated(EnumType.STRING)
    private TemplateUseStatus usedStatus;

}
