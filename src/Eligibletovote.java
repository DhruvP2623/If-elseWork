import java.util.Scanner;

public class Eligibletovote
{
    static int age;


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);//Scanner object
        System.out.println("Enter your Age:");
        int age = scanner.nextInt();// declared variable


        if(age>= 18){
            System.out.println(" Eligible for voter registration ");
        }
        else{
            System.out.println(" Not Eligible for voter registration ");
        }




    }
}
