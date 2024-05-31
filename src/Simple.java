import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate the Simple Interest");
        System.out.println("Enter the principle");
        double principle = input.nextDouble();
        System.out.println("Enter the rate");
        double rate = input.nextDouble();
        System.out.println("Enter the time");
        double time = input.nextDouble();
        double simple = (principle*rate*time)/100;
        System.out.println("Simple interest "+simple);
    }
}
