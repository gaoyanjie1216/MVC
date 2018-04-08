package com.gyj.mvc.service;

import com.gyj.mvc.model.Course;

public interface CourseService {

	/**
	 * 根据课程Id查询课程信息
	 * @param courseId
	 * @return
     */
	public Course getCoursebyId(Integer courseId);
}
