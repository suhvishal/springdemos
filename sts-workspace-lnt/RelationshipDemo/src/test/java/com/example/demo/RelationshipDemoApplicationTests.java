package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.repository.ProgrammerRepository;
import com.example.demo.repository.ProjectRepository;

@SpringBootTest
class RelationshipDemoApplicationTests {

	@Autowired
	ProgrammerRepository programmerRepository; 
	
	@Autowired
	ProjectRepository projectRepo;
	
	@Test
	void contextLoads() {
	}

//	@Test
//	public void testCreateProgrammer() {
//		Programmer programmer = new Programmer();
//		programmer.setName("Vinod");
//		programmer.setSal(1000);
//		
//		Set<Project> projects = new HashSet<>();
//		projects.add(new Project("P1"));
//		
//		programmer.setProjects(projects);
//		
//		programmerRepository.save(programmer);
//		
		
//		Programmer programmer2 = new Programmer();
//		programmer2.setName("Yashwant");
//		programmer2.setSal(1000);
//		
//	    Optional<Project> optionalProject = 	projectRepo.findById(2);
//	    
//		Set<Project> projects2 = new HashSet<>();
//		projects2.add((optionalProject.get()));
//		programmer2.setProjects(projects2);
//		
//		programmerRepository.save(programmer2);
		
		
//	}
	
	@Test
	@Transactional
	public void testFetchProjects() {
		Optional<Project> project = projectRepo.findById(2);
		Project p1 = project.get();
		
		
		System.out.println(p1);
		//System.out.println(p1.getProgrammers());
	}
}
