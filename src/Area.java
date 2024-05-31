import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Weclome to calculate area of triangle ");
        System.out.println("Enter the Base of triangle ");
        double base = input.nextDouble();
        System.out.println("Enter the height of triangle");
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of triangle "+area);

    }
}
