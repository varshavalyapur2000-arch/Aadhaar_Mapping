package com.jsp.pa.person_aadhaar_springboot;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String name;
	private int age;
	private String gender;
	
	@OneToOne
	@JoinColumn(name ="aid")
	private Aadhaar aadhaar;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Aadhaar getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(Aadhaar aadhaar) {
		this.aadhaar = aadhaar;
	}

	
}


