package com.learning.dataJPA.Spring_Data_JPA_and_Hibernate.course.SpringDataJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.dataJPA.Spring_Data_JPA_and_Hibernate.course.Course;

public interface SpringDataJPARepository extends JpaRepository<Course,Long> {

}
