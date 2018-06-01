package com.example.esgi.evaluation.manager.core.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String firstname;
	private String lastname;
	private Date birthday;
	
	public Student() {
	}
	
	public Student(String firstname, String lastname, Date birthday) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthday = birthday;
	}

	public long getId() {
		return id;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
