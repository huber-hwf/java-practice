import java.util.ArrayList;

public class findByName {
    public static student findname(ArrayList<student> students, String name){
        int i;
        for(i=0; i<students.size(); i++){
            if(students.get(i).getName().equals(name))
                break;
        }
        return i< students.size()?students.get(i):null;
    }
}
