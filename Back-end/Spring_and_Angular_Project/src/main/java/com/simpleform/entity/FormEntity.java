package com.simpleform.entity;

import jakarta.persistence.*;

@Entity
@Table(name="FormData1")
public class FormEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;

	@Column(name="name")
	String name;
	
	@Column(name="email")
	String email;
	
	@Column(name="mobile")
	String mobile;

	
	public FormEntity() {
		super();
	}
	
	public FormEntity(String name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
}
