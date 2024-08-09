public class student {
    private String name;
    private String email;

    public student(){
        name = "Unassined";
        email =  "Unassined";
    }
    public void setName(String studentName){
        name = studentName;
    }
    public void setEmail(String addess){
        email = addess;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
}
