import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("check the value of number");
        System.out.println("Please enter number");
        int num = input.nextInt();
        if (num >=1){
            System.out.println("postive");
        } else if (num==0){
            System.out.println("zero");
        } else {
            System.out.println("negative");
        }

    }
}
