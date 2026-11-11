import java.util.ArrayList;

import java.util.Scanner;

public class system {
    public static void main(String[] args) {
        //创建一个学生集合
        ArrayList<student> students=new ArrayList<student>();

        //创建一个Scanner对象
        Scanner sc=new Scanner(System.in);

        while(true){
            //输出菜单
            System.out.println("-----欢迎进入学生信息查询系统-----");
            System.out.println("1.添加学生信息");
            System.out.println("2.查询所有学生");
            System.out.println("3.按学号查询学生");
            System.out.println("4.按姓名模糊查询");
            System.out.println("5.修改学生信息");
            System.out.println("6.删除学生信息");
            System.out.println("7.退出系统");

            //根据用户输入进行判断
            switch(sc.nextInt()){
                case 1:{
                    System.out.println("请输入学生的姓名");
                    String name=sc.next();
                    System.out.println("请输入学生的学号");
                    String id=sc.next();
                    System.out.println("请输入学生的性别");
                    String gender=sc.next();
                    System.out.println("请输入学生的年龄");
                    int age=sc.nextInt();
                    System.out.println("请输入学生的班级");
                    String ClassName=sc.next();
                    System.out.println("请输入学生的手机号");
                    String phone=sc.next();
                    students.add(addStudent.addstudent(name, id, gender, age, ClassName, phone));
                    System.out.println("添加成功！");
                    break;
                }
                case 2:{
                    System.out.println("-----所有学生信息-----");
                    findAll.findall(students);
                    break;
                }
                case 3:{
                    System.out.println("请输入学生的学号");
                    String id=sc.next();
                    student stud=findById.findid(students, id);
                    if(stud!=null)
                    System.out.println(stud.getName()+"\t"+stud.getId()+"\t"+stud.getGender()+"\t"
                            +stud.getAge()+"\t"+stud.getClassName()+"\t"+stud.getPhone());
                    else System.out.println("学生不存在");
                    break;
                }
                case 4:{
                    System.out.println("请输入学生的姓名");
                    String name=sc.next();
                    student stud=findByName.findname(students, name);
                    if(stud!=null)
                        System.out.println(stud.getName()+"\t"+stud.getId()+"\t"+stud.getGender()+"\t"
                                +stud.getAge()+"\t"+stud.getClassName()+"\t"+stud.getPhone());
                    else System.out.println("学生不存在");
                    break;
                }
                case 5:{
                    System.out.println("请输入学生的学号");
                    String id=sc.next();
                }
            }
        }
    }
}
//   · 用 ArrayList<Student> 保存学生
//   · 添加学生 addStudent
//   · 查询全部 findAll
//   · 按学号查询 findById
//   · 按姓名查询 findByName
//   · 修改学生 updateStudent
//   · 删除学生 deleteStudent
//   · 判断学号是否存在 existsById