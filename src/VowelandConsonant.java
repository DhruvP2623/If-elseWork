import java.util.Scanner;

public class VowelandConsonant
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Scanner object
        System.out.println("Enter any Alphabet");
        char ch = scanner.next().charAt(0);// declared variable

        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' |  ch=='I' || ch=='O' || ch=='U')
        {
            System.out.println("Enter Alphabet is Vowel");
        }
        else if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            System.out.println("Enter Alphabet is Consonant");

        else
            System.out.println("Not an Alphabet");

    }

}
