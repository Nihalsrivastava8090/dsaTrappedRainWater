import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to leap year");
        int year = input.nextInt();
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Year is leap ");
        } else {
            System.out.println("year is not leap year");
        }

    }
}
