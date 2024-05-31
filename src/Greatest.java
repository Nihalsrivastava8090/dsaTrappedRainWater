import java.sql.SQLOutput;
import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if (num1 > num2 && num1 > num3)
        {
            System.out.println(num1+"num1 is greatest");
        } else if ( num2 > num1 && num2 > num3 ) {
            System.out.println( +num2+"num2 is greatest");
        } else {
            System.out.println(num3+"num3 is greatest");
        }
    }
}
