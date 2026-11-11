import java.util.ArrayList;

public class findById {
    public static student findid(ArrayList<student> students, String id){
        int i;
        for(i=0; i<students.size(); i++){
            if(students.get(i).getId().equals(id))
                break;
        }
        return i<students.size()?students.get(i):null;
    }
}
