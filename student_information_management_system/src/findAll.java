import java.util.ArrayList;

public class findAll {
    public static void findall(ArrayList<student> stu){
        //String name, String id, String gender, int age, String ClassName, String phone
        for(int i=0; i<stu.size(); i++){
            student stud=stu.get(i);
            System.out.println(stud.getName()+"\t"+stud.getId()+"\t"+stud.getGender()+"\t"
                    +stud.getAge()+"\t"+stud.getClassName()+"\t"+stud.getPhone());
        }
    }
}
