package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	private static ArrayList<Course> course;
	private static ArrayList<Semester> semester;
	private static ArrayList<Section> section;
	private static ArrayList<Student> student;
	private static ArrayList<Enrollment> enroll;

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
	}

	@Test
	public void Enroll() {
		Enrollment enrolling = null;
		double i = 0;
		for (Section sec : section) {
			for (Student stu : student) {
				enrolling = (new Enrollment(stu.getStudentID(), sec.getSectionID()));
				enroll.add(enrolling);
				for (Enrollment enrol : enroll) {
					enrol.setGrade(i);
					if (i > 100) {
						i = 0;
					} else {
						i += 10;
					}

				}
			}
		}

		double GPA = 0;
		double allgrades = 0;
		double totalcredits = 0;

	}

	private void gpa() {
		// TODO Auto-generated method stub

	}

	@Test
	public void majorchangetest() {

		Student student4 = student.get(3);
		student4.setMajor(eMajor.COMPSI);

		assertEquals(student4.getMajor(), eMajor.COMPSI);
	}
}