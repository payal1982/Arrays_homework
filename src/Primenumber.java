import java.util.Scanner;
public class Primenumber
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num=sc.nextInt();
        int i, count, j;
        count=0;
        for (i=2;i<=num/2;i++)
        {

            if(num%i==0)
            {
                count++;
                break;
            }
        }
        if (count==0)
        {
            System.out.println( num + " is a Prime Number.");
        }
        else
        {
            System.out.println( num + " is not a Prime Number.");
        }
    }

}
