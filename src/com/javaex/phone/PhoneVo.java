package com.javaex.phone;

public class PhoneVo {

	//필드
	private int phoneId;
	private String name;
	private String hp;
	private String company;

	//생성자
	public PhoneVo() {
	}
	
	public PhoneVo(int phoneId) {
		this.phoneId = phoneId;
	}

	public PhoneVo(String name) {
		this.name = name;
	}


	public PhoneVo(String name, String hp) {
		this.name = name;
		this.hp = hp;
	}


	public PhoneVo(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	

	public PhoneVo(int phoneId, String name, String hp, String company) {
		this.phoneId = phoneId;
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	
	
	//메소드 g/s
	
	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	//메소드 일반
	//listInfo
	public void listInfo() {
		System.out.println(phoneId + "\t" + name + "\t" + hp + "\t" + company);
	}
	
	
	@Override
	public String toString() {
		return "PhoneVo [name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}

}
