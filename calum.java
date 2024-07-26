import java.util.Scanner;

public class calum {
    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Input Number1 : ");
        x = in.nextInt();
        System.out.println("Your Munber1 is "+x);
        System.out.print("Input Munber2  ");
        y = in.nextInt();
        System.out.println("Your Munber2 is "+y);
        System.out.print(x+" + " +y+ " = " +(x+y));
    }
}
