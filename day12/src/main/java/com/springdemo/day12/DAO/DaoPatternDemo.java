package com.springdemo.day12.DAO;

public class DaoPatternDemo {

	public static void main(String[] args) {
        // TODO Auto-generated method stub

         StudentDao dao = new StudentDaoImpl();


         for(Student stud : dao.getAllStudents()) {
             System.out.println("Student : roll no "+stud.getRollNo()+"  Name : "+ stud.getName());



         }
    }
}
