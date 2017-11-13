package com.vcread.unioncloud.console.entity.db;

import com.vcread.unioncloud.console.entity.enu.OperatorType;
import com.vcread.unioncloud.convert.OperatorTypeConvert;
import com.vcread.unioncloud.utils.IdGen;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Description: 语音通话节点信息
 * @Date: 2017/10/16 11:53
 * @Author: panliyong
 */
@Data
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update voice_call_node_info set remove=true,last_modified=now() where id=?")
public class VoiceCallNodeInfo{

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer nodeId;
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
     * 节点名称
     */
    private String nodeName;
    /**
     * 节点省份
     */
    private String nodeProvince;
    /**
     * 节点城市
     */
    private String nodeCity;
    /**
     * 节点类型，3:电信，2：联通，1：移动
     */
    @Convert(converter = OperatorTypeConvert.class)
    @Column
    private OperatorType nodeType;
    /**
     * 备注
     */
    private String remarks;

    @OneToMany(mappedBy = "node")
    private List<VoiceCallDeviceInfo> voiceCallDeviceInfos;
}