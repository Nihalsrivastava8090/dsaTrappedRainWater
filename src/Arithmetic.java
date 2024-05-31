import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number A");
        int a = input.nextInt();
        System.out.println("Enter the number B");
        int b = input.nextInt();
        int sum;
        sum = a + b;
        System.out.println("addition the A and Bn "+sum);
        int sub;
        sub = a-b;
        System.out.println("subtraction the A and B "+sub);
        int mul;
        mul = a * b;
        System.out.println("Multiply the A and B "+mul);
        int div;
        div = a/b;
        System.out.println("Divide the A and B "+div);
        int mod;
        mod = a%b;
        System.out.println("remdinder the A and B "+mod);



    }
}
