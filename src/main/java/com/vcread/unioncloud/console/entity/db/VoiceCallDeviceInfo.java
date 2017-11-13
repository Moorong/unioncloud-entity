package com.vcread.unioncloud.console.entity.db;

import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @Description: 语音通话节点信息
 * @Date: 2017/10/16 11:53
 * @Author: panliyong
 */
@Data
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update voice_call_device_info set remove=true,last_modified=now() where id=?")
public class VoiceCallDeviceInfo {

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer deviceId;
    /**
     * 创建时间
     */
    @CreatedDate
    private LocalDateTime createTime;

    /**
     * 最后修改时间
     */
    @LastModifiedDate
    private LocalDateTime lastModified;

    /**
     * 是否删除，用于逻辑删除
     */
    private Boolean remove = false;
    /**
     * Int 从属的节点id
     */
    @ManyToOne
    private VoiceCallNodeInfo node;
    /**
     * vchar(24)   设备IP
     */
    private String deviceIp;
    /**
     * Int 设备端口
     */
    private Integer devicePort;
    /**
     * Int 设备资源数量
     */
    private Integer deviceResource;
    /**
     * vchar(24)   备注
     */
    private String remarks;

}