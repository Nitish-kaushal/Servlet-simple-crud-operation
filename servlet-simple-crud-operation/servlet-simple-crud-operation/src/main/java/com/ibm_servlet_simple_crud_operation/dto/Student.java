package com.ibm_servlet_simple_crud_operation.dto;

public class Student {
	private int id;
	private String firstname;
	private String lastname;
	private String nickname;
	private String email;
	private String password;
	private String dob;
	private long mobile;
	private String gender;
	private String address;

	public Student() 
	{
		super();
		
	}

	public Student(int id, String firstname, String lastname, String nickname, String email, String password,
			String dob, long mobile, String gender, String address) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.nickname = nickname;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.mobile = mobile;
		this.gender = gender;
		this.address = address;
	}

	public Student(String firstname, String lastname, String nickname, String email, String password, String dob,
			long mobile, String gender, String address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.nickname = nickname;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.mobile = mobile;
		this.gender = gender;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
	

	