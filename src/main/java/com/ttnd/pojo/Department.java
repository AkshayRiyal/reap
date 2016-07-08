package com.ttnd.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Department {
	@Id @GeneratedValue
	private Integer dept_id;
	private String practice;
	private String service_line;
	public String getPractice() {
		return practice;
	}
	public void setPractice(String practice) {
		this.practice = practice;
	}
	public Integer getDept_id() {
		return dept_id;
	}
	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}
	public String getService_line() {
		return service_line;
	}
	public void setService_line(String service_line) {
		this.service_line = service_line;
	}

}
