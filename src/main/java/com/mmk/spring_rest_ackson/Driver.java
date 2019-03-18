package com.mmk.spring_rest_ackson;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {
	public static void main(String[] args) {
		try {
			// Create Object Mapper
			ObjectMapper mapper = new ObjectMapper();

			// Read JSON file convert to POJO
//			Student student = mapper.readValue(new File("data/sample-lite.json"), Student.class);
			Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);

			// print
			System.out.println("Student - " + student);
			System.out.println("First Name - " + student.getFirstName());
			System.out.println("Last Name - " + student.getLastName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
