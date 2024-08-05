import java.util.ArrayList;
public class ArrayLostDemo {
    public static void main(String[] args) {
        ArrayList nameList = new ArrayList();
        nameList.add("Emmy");
        nameList.add("Java");
        nameList.add("Micro");
        System.out.println("The ArrayList has"+nameList.size()
        +" object stored on it.");
        for(int index = 0; index < nameList.size(); index++){
            System.out.println(nameList.get(index));
        }
    }
}
