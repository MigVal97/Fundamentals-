package org.fundamentals.classes;
import java.util.ArrayList;

public class Courses {
    String courseName;
    String professorName;
    int year;
    ArrayList<Student> students;

    public Courses(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.students = new ArrayList<>();
    }

    public void enroll(Student student) {
        students.add(student);
    }

    public void unEnroll(Student student) {
        students.remove(student);
    }

    public int countStudents() {
        return students.size();
    }

    public int bestGrade() {
        int best = 0;
        for (Student student : students) {
            if (student.grade > best) {
                best = student.grade;
            }
        }
        return best;
    }

   
    public void enroll(Student[] studentsArray) {
        for (Student student : studentsArray) {
            enroll(student);
        }
    }
}