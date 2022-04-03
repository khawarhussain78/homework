package com.homework.homework.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
	private long id;


	private String name, father_name;
	public Student(long id, String name, String father_name) {
		super();
		this.id = id;
		this.name = name;
		this.father_name = father_name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", father_name=" + father_name + "]";
	}
	
	
}
