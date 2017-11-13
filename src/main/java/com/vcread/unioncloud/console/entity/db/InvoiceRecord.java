package com.vcread.unioncloud.console.entity.db;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedBy;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

/**   
 * @Title: InvoiceRecord.java 
 * @Package com.vcread.unioncloud.console.entity.db 
 * @Description: 发票记录表
 * @author liu dong jie
 * @date 2017年8月28日 上午11:33:38 
 * @version V1.0   
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Where(clause = "remove=false")
@SQLDelete(sql = "update invoice_record set remove=true,last_modified=now() where id=?")
public class InvoiceRecord extends Base {

    /**
     * 商户
     */
    @ManyToOne
    private Account account;

    /**
     * 公司名称
     */
    private String companyName;


    /**
     * 开具发票金额
     */
    private Double amount;

    /**
     * 快递公司
     */
    private String expressCompany;

    /**
     * 快递单号
     */
    private String expressNum;

    /**
     * 收取地址
     */
    private String address;

    /**
     * 收件人
     */
    private String receiver;

    /**
     * 收件手机号
     */
    private String phoneNumber;

    /**
     * 扫描件
     */
    private String scanner;

    /**
     * 操作人
     */
    @CreatedBy
    @ManyToOne
    private User user;

    /**
     * 开具发票时间
     */
    private LocalDateTime invoicingTime;


}