import java.util.Scanner;

public class Perameter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to perimeter of rectangle");
        System.out.println("Enter the value of side1 of rectangle");
        int side1 = input.nextInt();
        System.out.println("Enter the value of side2 of rectangle");
        int side2 = input.nextInt();
        System.out.println("Enter the value of side3 of rectangle");
        int side3 = input.nextInt();
        System.out.println("Enter the value of side4 of rectangle");
        int side4 = input.nextInt();
        int perimeter = side1 + side2 + side3 + side4;
        System.out.println("Perimeter of rectangle "+perimeter);

    }
}
