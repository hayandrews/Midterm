package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

/**
 * 
 * @author Hayley Andrews
 *
 */
public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;

	/**
	 * 
	 * @param StartDate
	 * @param Enddate
	 */
	public Semester(Date StartDate, Date Enddate) {
		this.SemesterID = UUID.randomUUID();
		this.StartDate = StartDate;
		this.EndDate = Enddate;
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
	 * @return StartDate
	 */
	public Date getStartDate() {
		return StartDate;
	}

	/**
	 * setter
	 * 
	 * @param startDate
	 */
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	/**
	 * 
	 * @return EndDate
	 */
	public Date getEndDate() {
		return EndDate;
	}

	/**
	 * setter
	 * 
	 * @param endDate
	 */
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

}
