package com.vcread.unioncloud.console.entity.db;

import com.vcread.unioncloud.utils.IdGen;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@MappedSuperclass
public class Base {

    /**
     * id
     */
    @Id
    @Column(length = 50)
    private String id = IdGen.DEFAULT.gen();
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

}