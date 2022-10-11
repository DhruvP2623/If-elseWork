import java.util.Scanner;
public class Positiveornegativeorzero
{

    static int number;

    public static void main(String[] args) {

        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);//Scanner object
        number = scanner.nextInt();// declared variable

        if(number>0){
            System.out.println("Number is Positive");
        }
        else if(number<0){
            System.out.println("Number is Negative");
        } else if (number == 0) {

            System.out.println("Number is Zero");
        }

    }

}
