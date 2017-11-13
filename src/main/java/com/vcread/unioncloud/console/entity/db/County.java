package com.vcread.unioncloud.console.entity.db;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * 区县
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update county set remove=true,last_modified=now() where id=?")
public class County extends Base {

    /**
     * 名称
     */
    private String name;

    /**
     * 名称拼音
     */
    private String pinyin;

    /**
     * 城市
     */
    @ManyToOne
    private City city;

}
