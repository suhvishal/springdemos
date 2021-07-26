package com.example.demo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Programmer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int salary;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "programmers_projects", 
					joinColumns = @JoinColumn(name="programmer_id", referencedColumnName = "id"),
					inverseJoinColumns = @JoinColumn(name="project_id", referencedColumnName = "id"))
	private Set<Project> projects;

	public Programmer() {
		super();
	}

	public Programmer(int id, String name, int sal, Set<Project> projects) {
		super();
		this.id = id;
		this.name = name;
		this.salary = sal;
		this.projects = projects;
	}

	
	
	
	@Override
	public String toString() {
		return "Programmer [id=" + id + ", name=" + name + ", salary=" + salary;
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

	public int getSal() {
		return salary;
	}

	public void setSal(int sal) {
		this.salary = sal;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	
	
}
