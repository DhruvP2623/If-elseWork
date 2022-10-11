import java.util.Scanner;

public class Alphabetnumbersymbol
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// Scanner object
        System.out.println("Enter any value:");
        char ch = scanner.next().charAt(0);// declared variable


        if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z'))
        {
            System.out.println("It is Alphabet");
        } else if ((ch >='0')&&(ch <='9')) {
            System.out.println("It is Number");
        } else{
            System.out.println(" Enter value is symbol");
        }



    }
}
