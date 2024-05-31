import java.util.Scanner;

public class Compound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Compound Interest");
        System.out.println("Enter the Principle amount Rs");
        double principle = input.nextDouble();
        System.out.println("Enter the rate ");
        double rate = input.nextDouble();
        System.out.println("Enter the time");
        double time = input.nextDouble();
        double compound = principle * Math.pow((1 + rate/100),time) ;
        System.out.println("Compound interest"+compound);
    }
}
