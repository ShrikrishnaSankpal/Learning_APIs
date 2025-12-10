package com.learning.dataJPA.Spring_Data_JPA_and_Hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.dataJPA.Spring_Data_JPA_and_Hibernate.course.Course;
import com.learning.dataJPA.Spring_Data_JPA_and_Hibernate.course.SpringDataJPA.SpringDataJPARepository;

@Component
public class SpringJdbcCommandLineRunner implements CommandLineRunner {

	/*
	 * @Autowired private CourseJdbcRepository repository;
	 */
	
	/*
	 * @Autowired private CourseJPARepository repository;
	 */
	@Autowired 
	private SpringDataJPARepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1,"AWS","bharat"));
		repository.save(new Course(2,"DEVOps","hari"));
		repository.save(new Course(3,"JAVA","Sourya"));
		repository.save(new Course(4,"#nettt","me"));
		
		repository.deleteById(2l);
		
		System.out.println(repository.findById(4l));
		
		
	}

}
