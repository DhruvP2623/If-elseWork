import java.util.Scanner;

public class Oddoreven
{
    static int number ;
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner object
        System.out.println("Enter Number = ");
        number = scanner.nextInt(); // declared variable

        String output = number % 2 ==0 ? "Even" : "Odd";
        
        System.out.println(number +" is " + output );
        

    }
}
