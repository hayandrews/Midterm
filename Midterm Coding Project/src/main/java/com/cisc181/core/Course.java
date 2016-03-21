package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

/**
 * 
 * @author Hayley Andrews
 *
 */

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;

	/**
	 * 
	 * @param CourseName
	 * @param GradePoints
	 * @param Major
	 */
	public Course(String CourseName, int GradePoints, eMajor Major) {
		this.CourseID = UUID.randomUUID();
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
		this.Major = Major;
	}

	/**
	 * 
	 * @return Major
	 */
	public eMajor getMajor() {
		return Major;
	}

	/**
	 * sets new Major
	 * 
	 * @param major
	 */
	public void setMajor(eMajor major) {
		Major = major;
	}

	/**
	 * 
	 * @return CourseID
	 */
	public UUID getCourseID() {
		return CourseID;
	}

	/**
	 * sets new Id
	 * 
	 * @param courseID
	 */
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	/**
	 * 
	 * @return CourseName
	 */
	public String getCourseName() {
		return CourseName;
	}

	/**
	 * set new CourseName
	 * 
	 * @param courseName
	 */
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	/**
	 * 
	 * @return GradePoints
	 */
	public int getGradePoints() {
		return GradePoints;
	}

	/**
	 * set new gradepoints
	 * 
	 * @param gradePoints
	 */
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

}
