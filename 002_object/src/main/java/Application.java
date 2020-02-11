import model.Student;
import model.Teacher;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        Student student1 = new Student("李莉", 20, "女");
        System.out.println("姓名: " + student1.getName());
        System.out.println("年龄: " + student1.getAge());
        System.out.println("性别: " + student1.getSex());

        Student student2 = new Student("王其", 21, "男");

        ArrayList<Student> initStudentList = new ArrayList<>();
        initStudentList.add(student1);
        initStudentList.add(student2);
        Teacher teacher = new Teacher("张龙", initStudentList);

        Student student3 = new Student("赵毅", 22, "男");
        teacher.addNewStudent(student3);

        teacher.showAllStudent();
    }
}
