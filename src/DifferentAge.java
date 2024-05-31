import java.util.Scanner;

public class DifferentAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age of of people");
        int age = input.nextInt();
        if (age<13)
        {
            System.out.println("you are child");
        } else if (age<20) {
            System.out.println("you are teen");

        } else if (age<60) {
            System.out.println("you are adult");
        } else{
            System.out.println("you are old");
        }
    }
}
