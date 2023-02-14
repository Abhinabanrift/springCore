package com.springcore.component;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("per")
public class Person {
	int id;
	@Value("Abhi")
	String name;
	@Value("intern")
	String desig;
	@Value("#{phlist}")
	ArrayList<Integer> contactNumbers;
	@Value("#{plist}")
	ArrayList<String> project;
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
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
//	@Autowired
//	public Person(int id, String name, String desig, ArrayList<Integer> contactNumbers, ArrayList<String> project) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.desig = desig;
//		this.contactNumbers = contactNumbers;
//		this.project = project;
//	}
//	@Autowired
	public Person( ) {
		
	}
	public Person( String name, String desig, ArrayList<Integer> contactNumbers, ArrayList<String> project) {
		super();
		
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", desig=" + desig + ", project=" + project + "]";
	}
	public ArrayList<Integer> getContactNumbers() {
		return contactNumbers;
	}
	public void setContactNumbers(ArrayList<Integer> contactNumbers) {
		this.contactNumbers = contactNumbers;
	}
	public ArrayList<String> getProject() {
		return project;
	}
	public void setProject(ArrayList<String> project) {
		this.project = project;
	}
}
