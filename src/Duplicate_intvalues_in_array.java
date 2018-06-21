//program to write duplicate integer values in an array
//i am trying to count the occurences of the values as well, but don't know why it does not work
//i cannot understand how can i instruct compiler to ignore the repeated values while iterating.
// eg when 1 is compared 1st time,it should ignore when the loop runs again for each digit
import java.util.Arrays;
public class Duplicate_intvalues_in_array

{
    public static void main(String [] args)
    {
        int[]a={1,2,1,3,4,1,8,6,4,8,3,4,3};//array declared
        int count,j;

        for (int i = 0; i<=a.length-1;i++)
        {
            count=0;
            for(j=i;j<a.length;j++)
            {
                if (a[i]==a[j])
                {
                   count++;

                }
            }
            System.out.println("Times the number " + a[i] + " occurs in the array is = " + count);
        }
    }
}
