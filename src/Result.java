import java.util.Scanner;
public class Result
{
    static int total;


    static double percentage;



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



            total = Math + Sci + eng;
            percentage = total / 3;

            System.out.println(Name + " rollNumber = " + RollNumber + " Toatl marks = " + total + " & percentage = " + percentage + "%");
             if (percentage >= 80) {
                System.out.println("A+ Grade");
            } else if (percentage >= 60) {
                System.out.println("A Grade");
            } else if (percentage >= 50) {
                System.out.println("B Grade");
            } else if (percentage >= 35) {
                System.out.println("C Grade");
            } else {
                System.out.println("Sorry to tell you are Fail");

            }

        }
    }

