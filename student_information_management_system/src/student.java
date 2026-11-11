public class student {
    private String name;
    private String id;
    private String gender;
    private int age;
    private String ClassName;
    private String phone;

    public student(){};
    public student(String name, String id, String gender, int age, String ClassName, String phone){
        this.name=name;
        this.id=id;
        this.gender=gender;
        this.age=age;
        this.ClassName=ClassName;
        this.phone=phone;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id=id;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getClassName(){
        return ClassName;
    }
    public void setClassName(String ClassName){
        this.ClassName=ClassName;
    }

    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
}
