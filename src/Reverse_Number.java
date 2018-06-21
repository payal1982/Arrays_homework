//program to input 5 digit number and then reverse it
import java.util.Scanner;
public class Reverse_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a five digit number: ");
        int num = sc.nextInt();//stores user input
        if (num < 10000 || num > 100000)//checks for valid number
        {
            System.out.println("Please re-start the program and enter a 5 digit number");
        } else//if number valid, proceeds to do sum of the digits
        {
            int rev = 0;
            int remainder;
            while (num > 0) {
                remainder = num % 10;//extracts the last digit
                rev = rev * 10 + remainder;//counter starts reversing the number
                num = num / 10;//decreases the number
            }
            System.out.println("The reverse of the above number is: " + rev);
        }
    }
}
