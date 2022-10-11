import java.util.Scanner;

public class LeapYear
{

    static int year;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);//Scanner object
        System.out.println("Enter Year = ");
        year = scanner.nextInt();// declared variable


        if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0))
        {
            System.out.println(year + " is leap year.");
        }
        else
        {
            System.out.println(year + " is not leap year.");
        }
    }

}
