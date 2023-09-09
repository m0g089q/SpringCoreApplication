package com.walmart.SampleMavenDemo.Model;

public class Employee {
	int age;
	String name;
	Address adr;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	/*public Employee(int age, String name, Address adr) {
		super();
		this.age = age;
		this.name = name;
		this.adr = adr;
	}*/
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", adr=" + adr + "]";
	}
	
	
}
