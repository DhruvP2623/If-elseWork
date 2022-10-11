import java.util.Scanner;

public class Numberandsymbol
{
    


    public static void main(String[] args) {
        int x;

        Scanner scanner = new Scanner(System.in);//Scanner object
        System.out.println("Enter number  a :");
        int a = scanner.nextInt();// declared variable

        System.out.println("Enter number b: ");
        int b = scanner.nextInt();// declared variable



        System.out.println("1. Addition");
        System.out.println("2. Division");
        System.out.println("3. Multiplication");
        System.out.println("4. Substration");
        System.out.println("Enter any symbol:");
        int num = scanner.nextInt();


        switch (num){

            case 1:
                x = a + b;
                System.out.println("Addition = " + x);
                break;
            case 2:
                x = a / b;
                    System.out.println("Division = " + x);
                    break;
            case 3 :
                x = a * b;
                System.out.println("Multiplication = " + x);
                break;
            case 4 :
                x = a - b;
                System.out.println("Substration = " + x);
                break;
            default:
                System.out.println("Symbol is not matching");


        }


    }
}
