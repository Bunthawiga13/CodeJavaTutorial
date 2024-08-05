import java.util.*;
public class ArrayDemo1 {
    public static void main(String[] args) {
        final int EMPLOYEE = 3 ;//ตัวแปรค่าคงที่
        int[] hours = new int[EMPLOYEE];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter hours workec by "+EMPLOYEE+ " employee.");
        for(int index = 0; index < EMPLOYEE; index++ ){
            System.out.print("Employee "+(index + 1) + " : ");
            hours[index] = in.nextInt();
        }
        System.out.println("The hours you enterred are : ");
        for(int index = 0; index < EMPLOYEE; index++){
            System.out.println(hours[index]);
        }
    }
}
