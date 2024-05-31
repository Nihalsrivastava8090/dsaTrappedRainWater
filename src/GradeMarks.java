import java.util.Scanner;

public class GradeMarks {
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the marks");
        float per = input.nextFloat();
        if (per > 90){
            System.out.println("you got A grade");
        } else if (per> 75 ) {
            System.out.println("you got B grade");
        } else if (per > 60) {
            System.out.println("you got C grade");
        } else if (per > 30) {
            System.out.println(" you got D grade");
        } else {
            System.out.println("you got E grade");
        }
    }
}
