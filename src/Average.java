public class Average
{

    public static void main(String[] args){

        int [] numbers = {4,10,8,14,5};// declared variable
        double average = 0.0;
        int sum = 0;

// declared for loop
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        average = sum / numbers.length;
        System.out.println("Average = " + average);
    }

}
