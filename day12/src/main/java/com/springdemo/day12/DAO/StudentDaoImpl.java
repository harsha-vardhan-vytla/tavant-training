package com.springdemo.day12.DAO;

import java.util.ArrayList;
import java.util.List;
 
public class StudentDaoImpl implements StudentDao {
 
    List<Student>  students;


    public StudentDaoImpl() {
        students= new ArrayList<Student>();
        Student student1 = new Student("Akash", 0);
        Student student2 = new Student("Rony", 1);
        students.add(student1);
        students.add(student2);

    }
 
    @Override
    public List<Student> getAllStudents() {
        // TODO Auto-generated method stub
        return students;
    }
 
    @Override
    public Student getStudent(int rollNo) {
        // TODO Auto-generated method stub
        return students.get(rollNo);
    }
 
    @Override
    public void updateStudent(Student student) {
        // TODO Auto-generated method stub
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student : roll no "+student.getRollNo()+"update in the database ");
    }
 
    @Override
    public void deleteStudent(Student student) {
        // TODO Auto-generated method stub

    }
 
}