import java.util.Scanner;

public class AtoF
{
    char alphabet ;

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);//Scanner object
        System.out.println("Enter a to f Alphabet: ");
       char Alphabet = scanner.next().charAt(0);// declared variable

        switch (Alphabet)
        {
            case 'a' :
                System.out.println("Agra");
                break;
            case 'b':
                System.out.println("Bristol");
                break;
            case 'c':
                System.out.println("Canbury");
                break;
            case 'd':
                System.out.println("Dagenham");
                break;
            case 'e':
                System.out.println("East Ham");
                break;
            case 'f':
                System.out.println("Fulham");
                break;
            default:
                System.out.println("No Alphabet match found");


        }

    }
}
