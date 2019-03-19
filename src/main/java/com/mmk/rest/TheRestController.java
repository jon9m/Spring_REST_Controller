package com.mmk.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmk.entity.Student;

@RestController
@RequestMapping("/api")
public class TheRestController {
	// hello end point

	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public String toRoot() {
//		return "hello world";
		return "{\"message\": \"root\"}";
	}

	@GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
	public String sayHello() {
//		return "hello world";
		return "{\"message\": \"hello world\"}";
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("sam", "bena"));
		students.add(new Student("tan", "pena"));
		students.add(new Student("ket", "nats"));
		students.add(new Student("rld", "joo"));

		return students;
	}

	@GetMapping("/student/{studentId}")
	public Student getStudents(@PathVariable String studentId) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("sam", "bena"));
		students.add(new Student("tan", "pena"));
		students.add(new Student("ket", "nats"));
		students.add(new Student("rld", "joo"));

		Student st = null;
		for (Student stu : students) {
			if (stu.getFirstName().equalsIgnoreCase(studentId)) {
				st = stu;
				break;
			}
		}

		return st;
	}

}
