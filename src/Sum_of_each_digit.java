//program to find total number of all the digits in a number
import java.util.*;
public class Sum_of_each_digit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a five digit number: ");
        int num = sc.nextInt();//stores user input
        if (num < 10000 || num > 100000)//checks for valid number
       {
            System.out.println("Please re-start the program and enter a 5 digit number");
        }
        else//if number valid, proceeds to do sum of the digits
        {
            int sum = 0;
            int remainder;
            while (num > 0)
            {
                remainder = num % 10;//extracts the last digit
                sum = sum + remainder;//counter adds the sums of last digits
                num=num/10;//decreases the number after each sum
            }
            System.out.println("The sum of the individual digits in the above number is " + sum);
        }

    }
}

