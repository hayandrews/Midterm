package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	private static ArrayList<Staff> staff;

	/**
	 * Sets up Staff List
	 * 
	 * @throws PersonException
	 */
	@BeforeClass
	public static void setup() throws PersonException {

		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 1980);
		Date realdate = date.getTime();

		Staff person1 = new Staff("John", "No", "Guy", realdate, "100 Somewhere Street", "123-456-7890", "email",
				"hours", 3, 100000, null, eTitle.MR);
		Staff person2 = new Staff("Mary", "No", "Jane", realdate, "101 Somewhere Street", "123-456-7891", "email",
				"hours", 3, 200000, null, eTitle.MS);
		Staff person3 = new Staff("Bob", "No", "Smith", realdate, "102 Somewhere Street", "123-456-7892", "email",
				"hours", 3, 300000, null, eTitle.MR);
		Staff person4 = new Staff("Lacy", "No", "Su", realdate, "103 Somewhere Street", "123-456-7893", "email",
				"hours", 1, 550000, null, eTitle.MRS);
		Staff person5 = new Staff("Bee", "No", "Sting", realdate, "104 Somewhere Street", "123-456-7894", "email",
				"hours", 1, 620000, null, eTitle.MR);
		staff = new ArrayList<Staff>();
		staff.add(person1);
		staff.add(person2);
		staff.add(person3);
		staff.add(person4);
		staff.add(person5);
	}

	/**
	 * test salary average
	 * 
	 * @throws PersonException
	 */
	@Test
	public void SalaryAveragetest() throws PersonException {
		double total = 0;
		double average = 0;
		for (Staff team : staff) {
			total += team.getSalary();
		}
		average = total / staff.size();
		assertEquals(average, 354000, .01);
	}

	/**
	 * tests phone exception
	 * 
	 * @throws PersonException
	 */
	@Test(expected = PersonException.class)
	public void invalidphonetest() throws PersonException {
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 1990);
		Date realdate = date.getTime();
		Staff newstaff = new Staff("Abe", "Two", "Low", realdate, "Nowhere Land", "112-2222", "email", "hours", 1,
				10000, (new Date(12 / 2 / 1995)), eTitle.MR);
	}

	/**
	 * tests date exception
	 * 
	 * @throws PersonException
	 */
	@Test(expected = PersonException.class)
	public void invaliddatetest() throws PersonException {
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 1290);
		Date realdate = date.getTime();
		Staff newstaff = new Staff("Abe", "Two", "Low", realdate, "Nowhere Land", "121-112-2222", "email", "hours", 1,
				10000, (new Date(12 / 2 / 1995)), eTitle.MR);
	}

}
