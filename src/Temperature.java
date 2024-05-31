import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Weclome to temperature");
        System.out.println("Enter the Fahrenheit");
        double f = input.nextDouble();
        double c =(f  - 32) * 5 / 9;
        System.out.println("Conver the fahrenheit to celuis"+c);
    }
}
