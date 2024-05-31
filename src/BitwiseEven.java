import java.util.Scanner;

public class BitwiseEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number");
        int n = input.nextInt();
        if ((n & 1) != 1){
            System.out.println("print even number");
        } else {
            System.out.println("print odd number");
        }
    }
}
