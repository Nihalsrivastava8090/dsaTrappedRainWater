import java.util.Scanner;

public class Leftshit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to left shift");
        System.out.print("enter the number");
        int a = input.nextInt();
        int b = a<<1;
        System.out.println("Result" +b);
    }
}
