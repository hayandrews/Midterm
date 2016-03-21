package com.cisc181.core;

import java.util.UUID;

/**
 * 
 * @author Hayley Andrews
 *
 */
public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;

	/**
	 * 
	 * @param CourseID
	 * @param SemesterID
	 * @param RoomID
	 */
	public Section(UUID CourseID, UUID SemesterID, int RoomID) {
		this.CourseID = CourseID;
		this.SemesterID = SemesterID;
		this.SectionID = UUID.randomUUID();
		this.RoomID = RoomID;
	}

	/**
	 * 
	 * @return CourseID
	 */
	public UUID getCourseID() {
		return CourseID;
	}

	/**
	 * setter
	 * 
	 * @param courseID
	 */
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	/**
	 * 
	 * @return SemesterID
	 */
	public UUID getSemesterID() {
		return SemesterID;
	}

	/**
	 * setter
	 * 
	 * @param semesterID
	 */
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}

	/**
	 * 
	 * @return SectionId
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
	 * @return RoomID
	 */
	public int getRoomID() {
		return RoomID;
	}

	/**
	 * setter
	 * 
	 * @param roomID
	 */
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

}
