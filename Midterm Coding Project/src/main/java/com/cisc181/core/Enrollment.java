package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

	/**
	 * no arg-constructor
	 */
	private Enrollment() {

	}

	/**
	 * 
	 * @param StudentID
	 * @param SectionID
	 */
	public Enrollment(UUID StudentID, UUID SectionID) {
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		this.EnrollmentID = UUID.randomUUID();
	}

	/**
	 * 
	 * @return SectionID
	 */
	public UUID getSectionID() {
		return SectionID;
	}

	/**
	 * setter
	 * 
	 * @param sectionID
	 */
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	/**
	 * 
	 * @return StudentID
	 */
	public UUID getStudentID() {
		return StudentID;
	}

	/**
	 * setter
	 * 
	 * @param studentID
	 */
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	/**
	 * 
	 * @return EnrollmentID
	 */
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	/**
	 * setter
	 * 
	 * @param enrollmentID
	 */
	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	/**
	 * 
	 * @return Grade
	 */
	public double getGrade() {
		return Grade;
	}

	/**
	 * setter
	 * 
	 * @param grade
	 */
	public void setGrade(double grade) {
		Grade = grade;
	}

}
