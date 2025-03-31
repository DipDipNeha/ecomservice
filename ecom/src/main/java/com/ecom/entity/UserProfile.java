/**
 * 
 */
package com.ecom.entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * 
 */
@Entity
public class UserProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String password;
	private String secQues;
	private String secAns;
	private String role;
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false)
	private Date created_timestamp;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecQues() {
		return secQues;
	}
	public void setSecQues(String secQues) {
		this.secQues = secQues;
	}
	public String getSecAns() {
		return secAns;
	}
	public void setSecAns(String secAns) {
		this.secAns = secAns;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getCreated_timestamp() {
		return created_timestamp;
	}
	public void setCreated_timestamp(Date created_timestamp) {
		this.created_timestamp = created_timestamp;
	}
	
	

}
