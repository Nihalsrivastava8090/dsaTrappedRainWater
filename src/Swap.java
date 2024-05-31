import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Weclome to swapping station\n\n");
        System.out.println("enter value of A");
        int a = input.nextInt();
        System.out.println("Enter the value of B");
        int b = input.nextInt();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping value A and B");
        System.out.println("New value of A"+a);
        System.out.println("New value of B"+b);

    }
}
