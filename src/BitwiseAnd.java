import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Bitwise And");
        System.out.print("Enter first number");
        int a = input.nextInt();
        System.out.print("enter second number");
        int b = input.nextInt();
        int c = a & b;
        System.out.println("Final resut "+c);
    }
}
