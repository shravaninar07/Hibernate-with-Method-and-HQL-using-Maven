package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pro_id;
	private String pro_name;
	private String subject;
	private long aadharno;
	private long mobileno;

	public int getPro_id() {
		return pro_id;
	}

	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public long getAadharno() {
		return aadharno;
	}

	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public Professor(int pro_id, String pro_name, String subject, long aadharno, long mobileno) {
		super();
		this.pro_id = pro_id;
		this.pro_name = pro_name;
		this.subject = subject;
		this.aadharno = aadharno;
		this.mobileno = mobileno;
	}

	public Professor() {

	}

	@Override
	public String toString() {
		return "Professor [pro_id=" + pro_id + ", pro_name=" + pro_name + ", subject=" + subject + ", aadharno="
				+ aadharno + ", mobileno=" + mobileno + "]";
	}

}
