import java.util.Scanner;

public class Ex5_1 {
    public static double calculateTringleArea(double base, double height) {
        return 0.5  * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the trinhle: ");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the trinhle: ");
        double height = scanner.nextDouble();

        double area = calculateTringleArea(base, height);

        System.out.println("The area of the tringle is: "+ area);
        scanner.close();
    }
}
