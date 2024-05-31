import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("check number is even or odd ");
        System.out.println("enter the number");
        int n = input.nextInt();
        if (n%2==0){
            System.out.println("Number is even");
        } else{
            System.out.println("Number is odd");
        }
    }
}
