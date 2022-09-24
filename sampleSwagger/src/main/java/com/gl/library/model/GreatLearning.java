package com.gl.library.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GreatLearning {
	private String courseName;
	private String courseType;
	private String instrutorName;

	public GreatLearning(String courseName) {
		this.courseName = courseName;
	}

	public GreatLearning( String courseType,String instructorName) {
		this.courseType = courseType;
		this.instrutorName = instructorName;
	}
}
