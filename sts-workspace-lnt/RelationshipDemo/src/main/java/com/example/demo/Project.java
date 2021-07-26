package com.example.demo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	private String name; 
	
	@ManyToMany(mappedBy = "projects", fetch = FetchType.EAGER)
	private Set<Programmer> programmers;

	public Project() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name;
	}



	public Project(String name) {
		super();
		this.name = name;
	}



	public Project(String name, Set<Programmer> programmers) {
		super();
		this.name = name;
		this.programmers = programmers;
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

	public Set<Programmer> getProgrammers() {
		return programmers;
	}

	public void setProgrammers(Set<Programmer> programmers) {
		this.programmers = programmers;
	}
	
	
	

}
