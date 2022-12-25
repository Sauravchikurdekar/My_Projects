package com.demo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value="staff2")
public class Staff extends Employee {
	
	@Column(name = "Subject")
	private String subject;
	@Column(name = "qualifi")
	private String qualifi;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getQualifi() {
		return qualifi;
	}
	public void setQualifi(String qualifi) {
		this.qualifi = qualifi;
	}
	@Override
	public String toString() {
		return "Staff [subject=" + subject + ", qualifi=" + qualifi + "]";
	} 
	
	

}