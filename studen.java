public class studen {
    private String id;
    private String name;
    private double gpa;
    public void setDetails(String ID, String n, double GPA){
        id = ID;
        name = n;
        gpa = GPA;
    }
    public void showDetails(){
        System.out.println("ID : "+id);
        System.out.println("NAME : "+name);
        System.out.println("GPA : "+gpa);
    }
    public static void main(String[] args) {
        studen sc1 = new studen();
        sc1.setDetails("12123", "Buntha", 3.50);
        sc1.showDetails();
        studen sc2 = new studen();
        sc2.setDetails("32321", "wipa", 3.33);
        sc2.showDetails();
    }
}
