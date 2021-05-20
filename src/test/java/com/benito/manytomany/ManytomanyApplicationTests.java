package com.benito.manytomany;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.benito.manytomany.entities.Programmer;
import com.benito.manytomany.entities.Project;
import com.benito.manytomany.repos.ProgrammerRepository;

@SpringBootTest
class ManytomanyApplicationTests {
	
	@Autowired
	private ProgrammerRepository repo;

	@Test
	void testManyToManyCreateProgrammer() {
		
		Programmer programmer = new Programmer("Ruben", 10000);
		ArrayList<Project> projects = new ArrayList<>();
		projects.add(new Project("Pagina web"));
		programmer.setProjects(projects);
		repo.save(programmer);
	}
	
	@Test
	public void testManyTomanyLoadProgrammer(){
		Programmer programmer = repo.findById(1).get();
		System.out.println(programmer);
		System.out.println(programmer.getProjects());
	}

}

