package com.learning.dataJPA.Spring_Data_JPA_and_Hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.learning.dataJPA.Spring_Data_JPA_and_Hibernate.course.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate SpringJdbcTemplete;
	private static String INSERT_QUERY =

			"""
					insert into course (id,name,author)
					values(?,?,?);

					""";

	private static String DELETE_QUERY =

			"""
						DELETE FROM course
						 WHERE id = ?;

					""";
	
	private static String SELECT_QUERY =

			"""
						SELECT * FROM course
						 WHERE id = ?;

					""";

	public void insert(Course course) {
		SpringJdbcTemplete.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void delete(int id) {
		SpringJdbcTemplete.update(DELETE_QUERY, id);
	}
	
	public Course getCourseByID(int id) {
		return SpringJdbcTemplete.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class),id);
	}
	
	
}
