package com.vcread.unioncloud.console.entity.db;

import com.vcread.unioncloud.console.entity.enu.MassMsgStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update mass_msg set remove=true,last_modified=now() where id=?")
public class MassMsg extends Base {

    /**
     * 应用
     */
    @ManyToOne
    private App app;
    /**
     * 操作人
     */
    @ManyToOne
    private User user;

    /**
     * 模板名称
     */
    private String name;

    /**
     * 模板内容
     */
    @Column(columnDefinition="TEXT")
    private String content;

    /**
     * 短信签名
     */
    private String sign;


    /**
     * 状态 1: 待审核 2: 已通过 3: 已驳回 4: 已删除 5: 待发送 6: 发送中 7: 已发送 8: 发送成功 9: 发送失败
     */
    @Enumerated(EnumType.STRING)
    private MassMsgStatus massMsgStatus;

    /**
     * 发送时间
     */
    private LocalDateTime sendTime;

    /**
     * 接收号码
     */
    @Column(columnDefinition="TEXT")
    private String recivePhoneNumber;

    /**
     * 审核记录
     */
    @OneToOne
    private MassMsgReviewLog massMsgReviewLog;

}