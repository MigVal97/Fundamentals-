package org.fundamentals.classes;

public class Student {
	 String firstName;
	    String lastName;
	    int registration;
	    int grade;
	    int year;

	  
	    public Student() {
	        this.firstName = "";
	        this.lastName = "";
	        this.registration = 0;
	        this.grade = 0;
	        this.year = 1;
	    }


	    public Student(String firstName, String lastName, int registration, int grade, int year) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.registration = registration;
	        this.grade = grade;
	        this.year = year;
	    }

	
	    public Student(String firstName, String lastName) {
	        this(firstName, lastName, 0, 0, 1);
	    }

	    public void printFullName() {
	        System.out.println(firstName + " " + lastName);
	    }

	    public boolean isApproved() {
	        return grade >= 60;
	    }

	    public int changeYearIfApproved() {
	        if (isApproved()) {
	            year += 1;
	            System.out.println("Felicitaciones!");
	        }
	        return year;
	    }
	}

