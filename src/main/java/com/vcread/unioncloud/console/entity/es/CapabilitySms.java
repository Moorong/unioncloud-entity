package com.vcread.unioncloud.console.entity.es;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author : renhuan
 * @email : blentle.huan.ren@gmail.com
 * @time : 2017/8/21
 * @description : 短信能力平台发送的短信流水,包括网关信息，发送者，接受者等
 * @since : 1.0
 */
@Document(indexName = "capability_sms")
public class CapabilitySms implements Serializable {
	@Id
	private String capaSmsId;

	@Field(type = FieldType.String, store = true)
	private String title;

	@Field(type = FieldType.String, store = true)
	private String content;

	@Field(type = FieldType.String, store = true)
	private String sender;

	@Field(type = FieldType.String, store = true)
	private String receiver;

	@CreatedDate
	private Date createDate;

	@LastModifiedDate
	private Date modifyDate;

	public String getCapaSmsId() {
		return capaSmsId;
	}

	public void setCapaSmsId(String capaSmsId) {
		this.capaSmsId = capaSmsId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
}
