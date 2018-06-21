//program where user can enter string and count total number of a in the string
import java.util.Scanner;
public class Count_an_alphabet_in_string
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.next();
        int count=0;//counter initiated
        for (int i=0;i<=str.length()-1;i++)//to iterate through each character of the string
        {
            if(str.charAt(i)=='a')//compares individual character
            {
                count++;
            }
        }
        System.out.println("Number of times alphabet a has appeared in the string: " + count);



    }

}
