import java.util.Scanner;

public class PassorFails {
    static int total;




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner object
        System.out.println("Enter student Name ");
        String Name = scanner.next();// declared variable

        System.out.println("Enter a Roll Number");
        int RollNumber = scanner.nextInt();// declared variable

        System.out.println("Enter Eng MArks");
        int eng = scanner.nextInt();// declared variable

        System.out.println("Enter Sci MArks");
        int Sci = scanner.nextInt();// declared variable

        System.out.println("Enter Math MArks");
        int Math = scanner.nextInt();// declared variable


        total = eng + Sci + Math;


        System.out.println(Name + " rollNumber = " + RollNumber + " Toatl marks = " + total );

        if (eng >= 35 && Sci >= 35 && Math >= 35) {
            System.out.println("Pass");
            System.out.println("Congratulation");
        } else {
            System.out.println("Fail");

        }

    }

}