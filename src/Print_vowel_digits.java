//Program to check number od vowels and digits with percentage in user input array
//the double function worked for 2 decimal places in previous homework for marksheet, but it refuses to work this time
import java.util.Scanner;
public class Print_vowel_digits
{
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String input=sc.nextLine();
        input=input.toLowerCase();
        int total_char=input.length();
        System.out.println("Total number of characters in the string: " + total_char);
        int count_vowel=0;
        int count_number=0;
        for (int i=0;i<input.length();i++)//iterating loop for vowels and numbers
        {
            //condition for vowels
            if (input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
            {
                count_vowel++;
            }
            //condition for numbers
            else if (input.charAt(i)== '1' || input.charAt(i)=='2'||input.charAt(i)=='3'
                    ||input.charAt(i)=='4'||input.charAt(i)=='5'||input.charAt(i)=='6'
                    ||input.charAt(i)=='7'||input.charAt(i)=='8'||input.charAt(i)=='9'||input.charAt(i)=='0')
            {
                count_number++;
            }
        }
        System.out.println("Vowels in the string: " + count_vowel);
        double vowel_percent=(count_vowel*100)/total_char;//count % of vowels in string
        double vowel_percent_roundoff=(double) Math.round(vowel_percent*100)/100;//round off to 2 decimal
        System.out.println("Percentage of vowels in the String: " + vowel_percent_roundoff + "%");
        System.out.println("Numbers in the string: " + count_number);
        double number_percent=(count_number*100)/total_char;//count % of numbers in string
        double number_percent_roundoff=(double) Math.round(number_percent*100)/100;//round off to 2 decimal
        System.out.println("Percentage of numbers in the String: " + number_percent_roundoff + "%");
    }
}
