import java.util.*;//helps to work with arrays and user input
public class Palindrome_number
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num=sc.nextInt();
        int remainder, rev;
        int original_num=num;
        rev=0;
        while (num>0)
        {
            remainder=num%10;//helps find last digit
            rev=rev*10 + remainder;//start placing last digit in reverse
            num=num/10;//reducing the number by 1 digit every loop
        }
        System.out.println("The number when reversed becomes: " + rev);
        if (rev==original_num)//checks condition whether reverse number is same as the original number
        {
            System.out.println(original_num + " is a Palindrome number.");
        }
        else
        {
            System.out.println(original_num + " is not a Palindrome number.");
        }
    }
}
