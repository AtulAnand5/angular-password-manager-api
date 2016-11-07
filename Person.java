package com.barclays.domain;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class Person {
	
	private int id;
	private String name;
	private int age;
	private int weight;

	public Person() {
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
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int setWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
