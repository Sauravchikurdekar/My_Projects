package com.demo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("trainer_coder")
public class Trainert extends Employee {
	@Column(name = "batchcode")
	private String batchcode;
	
	@Column(name = "location")
	private String lication;

	public String getBatchcode() {
		return batchcode;
	}

	public void setBatchcode(String batchcode) {
		this.batchcode = batchcode;
	}

	public String getLication() {
		return lication;
	}

	public void setLication(String lication) {
		this.lication = lication;
	}

	@Override
	public String toString() {
		return "Trainert [batchcode=" + batchcode + ", lication=" + lication + "]";
	}
	
	

}
