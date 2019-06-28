package com.hibernate.org;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account1")
public class AccountEntity {
	@Id
	@GeneratedValue
	@Column(name = "account_id")
	private Integer acountid;
	@Column(name = "account_number")
	private String accountnumber;
	
	public Integer getAcountid() {
		return acountid;
	}

	public void setAcountid(Integer acountid) {
		this.acountid = acountid;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	@ManyToOne
	private EmployeeEntity entity;
	public EmployeeEntity getEntity() {
		return entity;
	}

	public void setEntity(EmployeeEntity entity) {
		this.entity = entity;
	}

	

}
