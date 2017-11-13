package com.vcread.unioncloud.console.entity.db;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * 市
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update city set remove=true,last_modified=now() where id=?")
public class City extends Base {

    /**
     * 城市名称
     */
    private String name;
    /**
     * 城市拼音
     */
    private String pinyin;

    @ManyToOne
    private Province province;

    @OneToMany(mappedBy = "city")
    private List<County> list;

}
