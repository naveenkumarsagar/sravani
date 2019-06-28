package com.hibernate.org;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "manyemp")
public class EmployeeEntity {
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Integer employeeid;
	@Column(name = "email")
	private String email;
	@Column(name = "first_name")
	private String firstname;
	@Column(name = "last_name")
	private String lastname;
	
	public Integer getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "Employee_Id")
	private Set<AccountEntity> account;
	public Set<AccountEntity> getAccount() {
		return account;
	}
	public void setAccount(Set<AccountEntity> account) {
		this.account = account;
	}
	

}
