package com.coderx.equal;


import java.util.*;

public class StudentDemo {
    public static void main(String[] args) {
//        Student student1 = new Student("001", "Shenal Fernando",22);
//        Student student2 = new Student("001", "Shenal Fernando",22);
//
//        String msg = student1.equals(student2) ? "Same" : "Not Same";
//        System.out.println(msg);

//        Set<Student> students = new TreeSet<>();
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("001", "Shenal Fernando",22);
        if(students.contains(student1)){
            System.out.println("Available!");
        }else {
            students.add(student1);
        }
        Student student2 = new Student("002","Pamudu Prabathiya",22);
        if (students.contains(student2)){
            System.out.println("Available!");
        }else{
            students.add(student2);
        }
        Student student3 = new Student("001", "Shenal Fernando",22);
        if (students.contains(student3)){
            System.out.println("Available!");
        }else{
            students.add(student3);
        }

//        students.add(new Student("001", "Shenal Fernando",22));
//        students.add(new Student("002","Pamudu Prabathiya",22));
//        students.add(new Student("003", "Vajith Chamuditha",21));
//        students.add(new Student("004","Ruchira Nishan",20));
//        students.add(new Student("001", "Shenal Fernando",22)); // duplication one not added

        for (Student student : students){
            System.out.println(student);
        }
    }
}
