package model;

public class Student {
    String name;
    int age;
    String sex;

    public void study(){
        System.out.println("I am studying. Don't bother me");
    }

    public void rest(){
        System.out.println("I am taking a rest.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}