package model;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private ArrayList<Student> studentList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void addToStudent(Student newStudent) {
        this.studentList.add(newStudent);
    }

    public void showAllStudent() {
        System.out.println("====管理的学生名单====");
        for (Student student: studentList){
            System.out.println(student.getName());
        }
        System.out.println("====================");
    }
}
