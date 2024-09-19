package org.fundamentals;
import org.fundamentals.classes.Courses;
import org.fundamentals.classes.Student;

public class Main {
	   public static void main(String[] args) {
	        Student student1 = new Student("Miguel", "Valencia", 123, 75, 1);
	        Student student2 = new Student("Cristian", "López", 456, 55, 1);
	        Student student3 = new Student("Rubén", "Aguirre", 789, 90, 1);

	        Courses course = new Courses("Matematicas", "Prof. Alberto Aguirre", 2024);
	        
	       
	        course.enroll(student1);
	        course.enroll(student2);
	        course.enroll(student3);
	       
	        student1.printFullName();
	        student3.printFullName();
	        
	        if (student1.isApproved()) {
	            student1.changeYearIfApproved();
	        }if 	(student3.isApproved()) {
	            	student3.changeYearIfApproved();
	        }
	        
	        System.out.println("Numero de estudiantes inscritos: " + course.countStudents());

	       
	        Student[] newStudents = {student2, student3};
	        course.enroll(newStudents);

	        
	        System.out.println("Mejor calificacion: " + course.bestGrade());
	        
	       
	        course.unEnroll(student1);
	        System.out.println("Numero de estudiantes desinscritos: " + course.countStudents());
	    }
	}
