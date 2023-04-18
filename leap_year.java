import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter year : ");
        int year = s.nextInt();
        if (year % 400 == 0) {
            System.out.println("Leap year : ");
        }
        //if not divisible by 400 and divisible 100 then not leap year
        else if (year % 100 == 0) {
            System.out.println("not Leap year : ");
        }
        else if (year % 4 == 0) {
            System.out.println("Leap year : ");
        }
        //if not divided by 100 and divided by 4 then leap year
        else {
            System.out.println(" not Leap year : ");
        }
    }
}