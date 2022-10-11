import java.util.Scanner;

public class Uppercaseandlowercase
{
    char alphabet;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Scanner object
        System.out.println("Enter Alphabet: ");
        char alphabet = scanner.next().charAt(0);// declared variable

        if((alphabet>='A')&& (alphabet<='Z')){
            System.out.println("You enter Uppercase Alphabet");
        }
        else {
            System.out.println("You enter Lowercase Alphabet");
        }



    }
}
