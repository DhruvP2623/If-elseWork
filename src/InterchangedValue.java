import java.util.Scanner;
public class InterchangedValue
{
    static int a,b,x;


    public static void main(String[] args) {

        System.out.println("Enter value of a and b : ");
        Scanner scanner = new Scanner(System.in);// Scanner object
        a = scanner.nextInt();// declared variable
        b = scanner.nextInt();// declared variable
        System.out.println("Before swapping value: "+a+" " +b);

        x = a;
        a = b;
        b = x;

        System.out.println("After swapping value:" +a+" "+b);
        System.out.println();


    }
}
