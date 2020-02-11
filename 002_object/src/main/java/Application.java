import model.Student;

public class Application {

    public static void main(String[] args) {
        Student student = new Student("李莉", 20, "女");
        System.out.println("姓名: " + student.getName());
        System.out.println("年龄: " + student.getAge());
        System.out.println("性别: " + student.getSex());

    }
}
