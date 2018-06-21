//program to take input of a 5 digit number and find the sum of the first and the last digit
import java.util.Scanner;
public class Sum_of_1st_and_last_digit
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
            int sum;
            int last_num, first_num;
            last_num = num % 10;//extracts the last digit
            while (num >=10)//keeps loop running till number reaches 2 digit
            {
                num = num / 10;
                //extracts the first digit, cant use % because it will return the second digit from the 2 digit number
                //we used / because we need the first digit

            }
            first_num = num;
            sum = first_num + last_num;
            //System.out.println(first_num);//to check the whether the number we found is 1st number
            System.out.println("The sum of the first and the last digit is: " + sum);
        }
    }
}

