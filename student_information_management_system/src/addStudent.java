import java.util.Scanner;

public class addStudent {
    public static student addstudent(String name, String id, String gender, int age, String ClassName, String phone) {
        return new student(name, id, gender, age, ClassName, phone);
    }
}
