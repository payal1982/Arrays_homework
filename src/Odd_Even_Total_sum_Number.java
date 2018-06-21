//progam to calculate the total of odd and even digits of the number and find the sum of them
import java.util.Scanner;
public class Odd_Even_Total_sum_Number
{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a 5 digit number:");
        int number = sc.nextInt();
        int final_num_even = number;//number to use for even digit calculation
        int final_num_odd = number; //used for odd digit calculation
        int digit1, digit2, odd_sum = 0, odd_count = 0, even_sum = 0, even_count = 0;
        if (number <10000 || number >100000)
        {
            System.out.println("Please restart the program and enter a 5 digit number.");
        } else {
            System.out.println("The even digits in the number are: ");
            while (final_num_even > 0)//program to print the even numbers seperately and then also show the sum of the even numbers
            {
                digit1 = final_num_even % 10;//seperating individual digit frm number
                if (digit1 % 2 == 0)//accessing whether digit is divisible by 2
                {
                    System.out.print(digit1 + " ");
                    even_sum = even_sum + digit1;//increasing the sum
                    even_count++;//if even counter increased
                }
                final_num_even = final_num_even / 10;//original number now reduced by 1 digit
            }
            System.out.println("\nThe sum of the even digits in the number= " + even_sum);
            //finding and printing the odd numbers and printing their total
            System.out.println("The odd digits in the number are: ");
            while (final_num_odd > 0) {
                digit2 = final_num_odd % 10;
                if (digit2 % 2 != 0) {
                    System.out.print(digit2 + " ");
                    odd_sum = odd_sum + digit2;
                    odd_count++;
                }
                final_num_odd = final_num_odd / 10;
            }
            System.out.println("\nThe sum of the odd digits in the number= " + odd_sum);
        }
    }
}
