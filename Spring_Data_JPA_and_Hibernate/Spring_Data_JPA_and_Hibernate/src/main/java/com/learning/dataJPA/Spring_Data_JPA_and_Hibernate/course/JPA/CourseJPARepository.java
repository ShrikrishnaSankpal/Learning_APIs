package com.learning.dataJPA.Spring_Data_JPA_and_Hibernate.course.JPA;

import org.springframework.stereotype.Repository;

import com.learning.dataJPA.Spring_Data_JPA_and_Hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
		
	}
	
	public Course getCourseByID(long id) {
		return entityManager.find(Course.class,id);
	}
	
	public void delete(long id) {
		 Course course = entityManager.find(Course.class,id);
		 entityManager.remove(course);
		 
	}

}
