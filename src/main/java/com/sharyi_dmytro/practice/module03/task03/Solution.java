package com.sharyi_dmytro.practice.module03.task03;

import java.util.Date;
import java.util.GregorianCalendar;

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        date.getDate();
        Course [] courses = new Course[5];
        Course course1 = new Course(date,"Math");
        Course course2 = new Course(10, "Alex");
        Course course3 = new Course(date,"History");
        Course course4 = new Course(22, "Meg");
        Course course5 = new Course(14, "Paul");
        Student student1 = new Student("Dmytro" , "Sharyi" ,1);
        Student student2 = new Student("Sydorov" , courses);
        Student student3 = new Student();
        CollegeStudent collegeStudent1 = new CollegeStudent("Oxford" , 90, 46547457);
        CollegeStudent collegeStudent2 = new CollegeStudent("Oliver" , "Kromvel", 7);
        CollegeStudent collegeStudent3 = new CollegeStudent("Felix",courses);
        SpecialStudent specialStudent1 = new SpecialStudent(23525436);
        SpecialStudent specialStudent2 = new SpecialStudent("Omarov",courses);




    }
}
