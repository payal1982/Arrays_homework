//program to check if the given number is an Armstrong number or not
import java.util.Scanner;
public class Armstrong_number
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter a number to check if it is an Armstrong number or not: ");
        int num=sc.nextInt();
        int digit;//individual digit to be retrieved
        //int powered;//individual digit is powered
        int sum=0;//checks the sum of all the  numbers
        int final_num=num;//to compare the final number
        int place_val=num;//helps to find how long the number is, so that we can accordingly cube/square power the digits
        int count=0;//counter to help us find the powers of the number
        while (place_val>0)//for counting numbers of digits in each number
        {
            place_val=place_val/10;//returns 1 digit every time
            count++;
        }
        while( num>0)//for executing the logic
        {
            digit=num%10;
            //powered=int(Math.pow(num,count);
            sum =(int) (sum + Math.pow(digit,count));
            //use int before the pow function to convert double to int, as pow accepts only double values
            num=num/10;
        }
        if (final_num==sum)
        {
            System.out.println("The number entered is an Armstrong number");
        }
        else
        {
            System.out.println("The number entered is not an Armstrong number");
        }
    }
}
        //can be used in case we know how the number
       /* while (num>0)//condition to see that each digit of the number is checked
        {
          digit=num%10;//extract individual digit at a time
          sum=sum + (digit*digit*digit);//adds cube of individual digit to the counter
          num=num/10;//everytime the loop runs last digit of the number is take out
        }
        System.out.println("The sum of cube of all individual digits in the number= " + sum);
        */

