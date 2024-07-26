import java.util.Scanner;
public class ifAct {
    public static void main(String[] args) {
        final int Poin = 60;
        int inputpoin ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your poin : ");
        inputpoin = scan.nextInt();
        System.out.println("You entered : " +inputpoin);
        if(inputpoin > 60)
        System.out.println("you are pass");
        if(inputpoin < 60)
        System.out.println("you are not pass");
    }
}
