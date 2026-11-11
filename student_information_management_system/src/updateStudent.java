import java.util.ArrayList;
import java.util.Scanner;

public class updateStudent {
    public static void update(ArrayList<student> students, int i){
        student stud=students.get(i);
        Scanner sc=new Scanner(System.in);
        //String name, String id, String gender, int age, String ClassName, String phone
        System.out.println("------修改信息-----");
        System.out.println("请选择一个操作：");
        System.out.println("1.修改学生姓名");
        System.out.println("2.修改学生学号");
        System.out.println("3.修改学生性别");
        System.out.println("4.修改学生年龄");
        System.out.println("5.修改学生班级");
        System.out.println("6.修改学生号码");
        System.out.println("7.停止修改学生信息");
        outter: while(true){
            int opt=sc.nextInt();
            switch(opt){
                case 1:{
                    System.out.println("请输入学生名字：");
                    String name=sc.next();
                    stud.setName(name);
                    break;
                }
                case 2:{
                    System.out.println("请输入学生学号：");
                    String id=sc.next();
                    stud.setId(id);
                    break;
                }
                case 3:{
                    System.out.println("请输入学生性别：");
                    String gender=sc.next();
                    stud.setGender(gender);
                    break;
                }
                case 4:{
                    System.out.println("请输入学生年龄：");
                    int age=sc.nextInt();
                    stud.setAge(age);
                    break;
                }
                case 5:{
                    System.out.println("请输入学生班级：");
                    String classname=sc.next();
                    stud.setClassName(classname);
                    break;
                }
                case 6:{
                    System.out.println("请输入学生的手机号码");
                    String phone=sc.next();
                    stud.setPhone(phone);
                    break;
                }
                case 7:{
                    break outter;
                }
                default:{
                    System.out.println("您输入的数字不对，请重新输入！");
                }
            }
            System.out.println("修改成功！");
        }
        System.out.println("已成功退出！");
    }
}
