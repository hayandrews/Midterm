package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

/**
 * 
 * @author Hayley Andrews
 *
 */
public class Student_Test {
	private static ArrayList<Course> course;
	private static ArrayList<Semester> semester;
	private static ArrayList<Section> section;
	private static ArrayList<Student> student;
	private static ArrayList<Enrollment> enroll;

	/**
	 * Creates instances of Student, Course, Semester and sections and adds to
	 * individual arrays Then Enrolls each of the 10 students in the created
	 * sections with a given grade
	 * 
	 * @throws PersonException
	 */
	@BeforeClass
	public static void setup() throws PersonException {

		Course course1 = new Course("Intro to Chemistry", 1, eMajor.CHEM);
		Course course2 = new Course("Intro to Physics", 1, eMajor.PHYSICS);
		Course course3 = new Course("Business Writing", 1, eMajor.BUSINESS);

		course = new ArrayList<Course>();
		course.add(course1);
		course.add(course2);
		course.add(course3);

		Calendar springdatestart = Calendar.getInstance();
		springdatestart.set(Calendar.YEAR, 2016);
		springdatestart.set(Calendar.MONTH, Calendar.FEBRUARY);
		springdatestart.set(Calendar.DATE, 8);
		Date realdate = springdatestart.getTime();

		Calendar springdateend = Calendar.getInstance();
		springdateend.set(Calendar.YEAR, 2016);
		springdateend.set(Calendar.MONTH, Calendar.MAY);
		springdateend.set(Calendar.DATE, 26);
		Date realdate2 = springdateend.getTime();

		Calendar falldatestart = Calendar.getInstance();
		falldatestart.set(Calendar.YEAR, 2016);
		falldatestart.set(Calendar.MONTH, Calendar.AUGUST);
		falldatestart.set(Calendar.DATE, 30);
		Date realdate3 = falldatestart.getTime();

		Calendar falldateend = Calendar.getInstance();
		falldateend.set(Calendar.YEAR, 2016);
		falldateend.set(Calendar.MONTH, Calendar.DECEMBER);
		falldateend.set(Calendar.DATE, 26);
		Date realdate4 = falldateend.getTime();

		Semester semester1 = new Semester(realdate, realdate2);
		Semester semester2 = new Semester(realdate3, realdate4);

		semester = new ArrayList<Semester>();
		semester.add(semester1);
		semester.add(semester2);

		Section section1 = new Section(course1.getCourseID(), semester1.getSemesterID(), 100);
		Section section2 = new Section(course1.getCourseID(), semester2.getSemesterID(), 100);
		Section section3 = new Section(course2.getCourseID(), semester1.getSemesterID(), 101);
		Section section4 = new Section(course2.getCourseID(), semester2.getSemesterID(), 101);
		Section section5 = new Section(course3.getCourseID(), semester1.getSemesterID(), 102);
		Section section6 = new Section(course3.getCourseID(), semester2.getSemesterID(), 102);

		section = new ArrayList<Section>();
		section.add(section1);
		section.add(section2);
		section.add(section3);
		section.add(section4);
		section.add(section5);
		section.add(section6);

		Calendar quickbday = Calendar.getInstance();
		quickbday.set(Calendar.YEAR, 1995);
		quickbday.set(Calendar.MONTH, Calendar.MARCH);
		quickbday.set(Calendar.DATE, 23);
		Date bday = springdatestart.getTime();

		Student student1 = new Student("Mark", "Mark", "Mark", bday, eMajor.BUSINESS, "adress", "111-111-1111",
				"email");
		Student student2 = new Student("Lu", "Lu", "Lu", bday, eMajor.BUSINESS, "adress", "111-111-1111", "email");
		Student student3 = new Student("Po", "Po", "Po", bday, eMajor.BUSINESS, "adress", "111-111-1111", "email");
		Student student4 = new Student("To", "To", "To", bday, eMajor.CHEM, "adress", "111-111-1111", "email");
		Student student5 = new Student("Lee", "Lee", "Lee", bday, eMajor.CHEM, "adress", "111-111-1111", "email");
		Student student6 = new Student("Jeff", "Jeff", "Jeff", bday, eMajor.CHEM, "adress", "111-111-1111", "email");
		Student student7 = new Student("Ann", "Ann", "Ann", bday, eMajor.PHYSICS, "adress", "111-111-1111", "email");
		Student student8 = new Student("Amy", "Amy", "Amy", bday, eMajor.PHYSICS, "adress", "111-111-1111", "email");
		Student student9 = new Student("Todd", "Todd", "Todd", bday, eMajor.PHYSICS, "adress", "111-111-1111", "email");
		Student student10 = new Student("Jack", "Jack", "Jack", bday, eMajor.COMPSI, "adress", "111-111-1111", "email");

		student = new ArrayList<Student>();
		student.add(student1);
		student.add(student2);
		student.add(student3);
		student.add(student4);
		student.add(student5);
		student.add(student6);
		student.add(student7);
		student.add(student8);
		student.add(student9);
		student.add(student10);

		enroll = new ArrayList<Enrollment>();

		for (Section sec : section) {
			for (Student stu : student) {
				double i = 0;
				Enrollment enrolling = (new Enrollment(stu.getStudentID(), sec.getSectionID()));
				enroll.add(enrolling);
				for (Enrollment enrol : enroll) {
					if (i < 101) {
						i += 10;
					}
					if (i > 100) {
						i = 0;
						i += 10;
					}
					enrol.setGrade(i);
				}
			}
		}

		Enrollment getenroll = enroll.get(11);
		Enrollment getanotherroll = enroll.get(1);
		assertEquals(getenroll.getGrade(), 20, .01);
		assertEquals(getenroll.getStudentID() == getanotherroll.getStudentID(), true);

		Enrollment getenroll1 = enroll.get(5);
		Enrollment getenroll2 = enroll.get(15);
		Enrollment getenroll3 = enroll.get(25);
		Enrollment getenroll4 = enroll.get(35);
		Enrollment getenroll5 = enroll.get(45);
		Enrollment getenroll6 = enroll.get(55);
		assertEquals(getenroll1.getGrade(), 60, .01);
		assertEquals(getenroll2.getGrade(), 60, .01);
		assertEquals(getenroll3.getGrade(), 60, .01);
		assertEquals(getenroll4.getGrade(), 60, .01);
		assertEquals(getenroll5.getGrade(), 60, .01);
		assertEquals(getenroll6.getGrade(), 60, .01);
	}

	/**
	 * Tests the average GPA for each student
	 */
	@Test
	public void GPAtest() {

		ArrayList<Double> allsum = new ArrayList<Double>();
		ArrayList<Double> allcredit = new ArrayList<Double>();

		double allgrades = 0;

		for (Student astu : student) {
			for (Enrollment aenroll : enroll) {
				if (aenroll.getStudentID() == astu.getStudentID()) {
					if (aenroll.getGrade() > 95) {
						aenroll.setGrade(4.0);
					} else if (aenroll.getGrade() >= 90 && aenroll.getGrade() < 95) {
						aenroll.setGrade(3.66);
					} else if (aenroll.getGrade() < 90 && aenroll.getGrade() >= 87) {
						aenroll.setGrade(3.33);
					} else if (aenroll.getGrade() < 87 && aenroll.getGrade() >= 83) {
						aenroll.setGrade(3.0);
					} else if (aenroll.getGrade() < 83 && aenroll.getGrade() >= 80) {
						aenroll.setGrade(2.66);
					} else if (aenroll.getGrade() < 80 && aenroll.getGrade() >= 77) {
						aenroll.setGrade(2.33);
					} else if (aenroll.getGrade() < 77 && aenroll.getGrade() >= 73) {
						aenroll.setGrade(2.0);
					} else if (aenroll.getGrade() < 73 && aenroll.getGrade() >= 70) {
						aenroll.setGrade(1.66);
					} else if (aenroll.getGrade() < 70 && aenroll.getGrade() >= 67) {
						aenroll.setGrade(1.33);
					} else if (aenroll.getGrade() < 67 && aenroll.getGrade() >= 63) {
						aenroll.setGrade(1.0);
					} else if (aenroll.getGrade() < 63 && aenroll.getGrade() >= 60) {
						aenroll.setGrade(0.66);
					} else {
						aenroll.setGrade(0);
					}
					allgrades += aenroll.getGrade();

				}
			}
			allsum.add(allgrades);
			allgrades = 0;
		}

		assertEquals(allsum.size(), 10, .01);
		double tc = allsum.get(0);
		assertEquals(tc, 0, .01);

		double tc3 = allsum.get(9);
		assertEquals(tc3, 24, .01);

		double totalcredits = 0;
		for (Student astu : student) {
			for (Course acourse : course) {
				for (Section asec : section) {
					if (asec.getCourseID() == acourse.getCourseID()) {
						totalcredits += acourse.getGradePoints();
					}
				}
			}
			allcredit.add(totalcredits);
			totalcredits = 0;
		}

		double sgpa = allcredit.get(0);
		assertEquals(sgpa, 6, .01);
		double sgpa2 = allcredit.get(9);
		assertEquals(sgpa2, 6, .01);
		double sgpa3 = allcredit.get(6);
		assertEquals(sgpa3, 6, .01);

		ArrayList<Double> gpa = new ArrayList<Double>();
		double adder = 0;
		for (int x = 0; x < allsum.size(); x++) {
			adder = allsum.get(x) / allcredit.get(x);
			gpa.add(adder);
		}
		assertEquals(gpa.size(), 10, .01);

		double tc2 = allsum.get(5);
		assertEquals(tc2, 3.96, .01);

		double gpa1 = gpa.get(0);
		assertEquals(gpa1, 0, .01);
		double gpa2 = gpa.get(2);
		assertEquals(gpa2, 0, .01);
		double gpa3 = gpa.get(3);
		assertEquals(gpa3, 0, .01);
		double gpa4 = gpa.get(4);
		assertEquals(gpa4, 0, .01);
		double gpa5 = gpa.get(5);
		assertEquals(gpa5, .66, .01);
		double gpa6 = gpa.get(6);
		assertEquals(gpa6, 1.66, .01);
		double gpa7 = gpa.get(7);
		assertEquals(gpa7, 2.66, .01);
		double gpa8 = gpa.get(8);
		assertEquals(gpa8, 3.66, .01);
		double gpa9 = gpa.get(9);
		assertEquals(gpa9, 4.0, .01);

	}

	/**
	 * Determines each course average and tested with assertEquals
	 */
	@Test
	public void gradeaveragetest() {
		ArrayList<Double> allcourses = new ArrayList<Double>();
		double total = 0;
		ArrayList<Double> studentcount = new ArrayList<Double>();
		double counttotal = 0;

		for (Section asec : section) {
			for (Enrollment aroll : enroll) {
				if (aroll.getSectionID() == asec.getSectionID()) {
					total += aroll.getGrade();
					counttotal += 1;
				}
			}
			allcourses.add(total);
			total = 0;
			studentcount.add(counttotal);
			counttotal = 0;
		}
		Double count1 = studentcount.get(1);
		assertEquals(count1, 10, 1);
		Double course1 = allcourses.get(1);
		assertEquals(course1, 550, .01);
		Double course9 = allcourses.get(5);
		assertEquals(course9, 550, .01);

		ArrayList<Double> gradeav = new ArrayList<Double>();
		double adder = 0;
		for (int x = 0; x < allcourses.size(); x++) {
			adder = allcourses.get(x) / studentcount.get(x);
			gradeav.add(adder);
		}

		double av1 = gradeav.get(0);
		assertEquals(av1, 55, 1);
		double av2 = gradeav.get(1);
		assertEquals(av2, 55, 1);
		double av3 = gradeav.get(2);
		assertEquals(av3, 55, 1);
		double av4 = gradeav.get(3);
		assertEquals(av4, 55, 1);
		double av5 = gradeav.get(4);
		assertEquals(av5, 55, 1);
		double av6 = gradeav.get(5);
		assertEquals(av6, 55, 1);

	}

	/**
	 * Changes the major of a student
	 */
	@Test
	public void majorchangetest() {

		Student student4 = student.get(3);
		student4.setMajor(eMajor.COMPSI);

		assertEquals(student4.getMajor(), eMajor.COMPSI);
	}
}