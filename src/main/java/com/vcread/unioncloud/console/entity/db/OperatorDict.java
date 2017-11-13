package com.vcread.unioncloud.console.entity.db;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;

/**
 * @author panliyong
 * @Description: 运营商与节点对应的字典表
 * @create 2017/9/3 10:29
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update operator_dict set remove=true,last_modified=now() where id=?")
public class OperatorDict extends Base{
    /**
     * 运营商ID
     */
    private String operatorId;
    /**
     * 节点ID
     */
    private String nodeId;
}
