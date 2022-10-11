import java.util.Scanner;

public class Uppercaseandlowercase
{
    static char ch,ch2;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Scanner object
        System.out.println("Enter Alphabet: ");
       ch= scanner.nextLine().charAt(0);// declared variable

        if (ch>='A' && ch<='Z'){
           ch2= Character.toLowerCase(ch);
            System.out.println("LowerCase " + ch2);
        }
        else {
            ch2=Character.toUpperCase(ch);
            System.out.println("UpperCase " + ch2);
        }


    }
}
