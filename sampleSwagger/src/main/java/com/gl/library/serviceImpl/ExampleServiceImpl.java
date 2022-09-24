package com.gl.library.serviceImpl;

import org.springframework.stereotype.Service;

import com.gl.library.model.GreatLearning;
import com.gl.library.service.ExampleService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ExampleServiceImpl implements ExampleService {

	@Override
	public GreatLearning get() {
		log.info("inside get() method");
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName("Learn Controller in Spring Boot");
		greatLearning.setCourseType("Information Technology");
		greatLearning.setInstrutorName("Daniel");
		return greatLearning;
	}

	@Override
	public GreatLearning customInfo(String courseName, String courseType, String instructorName) {
		log.info("inside custominfo() method");
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName(courseName);
		greatLearning.setCourseType(courseType);
		greatLearning.setInstrutorName(instructorName);
		return greatLearning;

	}
}
