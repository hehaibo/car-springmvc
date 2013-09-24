package com.hhb.demo.model;

import java.io.Serializable;

public class Demo implements Serializable {
	private static final long serialVersionUID = 8536266926576960225L;
	/**
	 * ID
	 */
	private Long id;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 类型备注
	 */
	private String remark;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
