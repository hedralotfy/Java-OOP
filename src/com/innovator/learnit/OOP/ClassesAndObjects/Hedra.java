package com.innovator.learnit.OOP.ClassesAndObjects;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Hedra {

	private static final int AGE = 20;
	private static final String NAME = "Hedra";
	private static final int DISCOUNT_RATE = 83;
	private static final String DISCOUNT_TYPE = "Special";
	private static final int CHARGE_SCALE = 2;

	private BigDecimal totalNetPrice; // Without taxes
	private static Courses[] courses;

	private static String courseName = "Java from zero to first Job";
	private static int timesVisitedCourse;

	private int id;
	private int userId;

	static {
		System.out.println("Hedra.class is uploaded into JVM");
	}

	{
		timesVisitedCourse++;
		userId = 1;

	}

	public Hedra() {

	}

	public Hedra(int id, int userId) {
		this.id = id;
		this.userId = userId;
	}

	private BigDecimal calculateTotalCost() {
		this.totalNetPrice = BigDecimal
				.valueOf(Arrays.stream(this.courses)
						.mapToDouble(course -> course != null ? course.getPrice().doubleValue() : 0).sum())
				.setScale(CHARGE_SCALE, RoundingMode.HALF_UP);
		return this.totalNetPrice;
	}

	public Courses[] getCourses() {
		return Arrays.copyOf(courses, courses.length);
	}

	public BigDecimal getTotalCost() {
		return totalNetPrice;
	}

	public static int getAge() {
		return AGE;
	}

	public static String getName() {
		return NAME;
	}
	
	public static int getDiscountRate() {
		return DISCOUNT_RATE;
	}
	
	public static String getDiscountType() {
		return DISCOUNT_TYPE;
	}
	
	public static String getCourseName() {
		return courseName;
	}
	
	public static int getTimesVisitedCourse(){
		return timesVisitedCourse;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		if(id < 0) {
			return;
		}
		this.id = id;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
