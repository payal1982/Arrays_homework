//user input string is reversed with appropriate message
import java.util.Scanner;
public class ReverseString
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string.");
        String str=sc.next();
        String original=str;
        String reverse="";
        //int length=str.length();
        char[] strarray=str.toCharArray();//converts string to character array
        for (int i=strarray.length-1;i>=0;i--)
        {
            reverse=reverse + strarray[i];

        }
        System.out.println("The reverse of string "+ "''"+ original +"''"+ " is " + "''"+ reverse +"''.");
    }
}
