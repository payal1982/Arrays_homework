import java.util.*;
public class Equality_of_arrays
{
    public static void main(String[]args)
    {
        String[] s1={"Payal", "Deepak","Patel"};
        System.out.print("Elements of Array 1 are: " );
        for ( String ss1:s1)
        {
            System.out.print( ss1+ " ");
        }
        String[] s2={" Payal","Nitya" ,"Param"};
        System.out.print("\nElements of Array 2 are: " );
        for ( String ss2:s2)
        {
            System.out.print( ss2+ " ");
        }
        String[] s3={"Payal", "Deepak", "Patel"};
        System.out.print("\nElements of Array 3 are: " );
        for ( String ss3:s3)
        {
            System.out.print( ss3+ " ");
        }
        System.out.println("\n Array 1 is equal to Array 2? " + Arrays.equals(s1,s2));
        //==does not work in arrays, so the built in method has to be used
        System.out.println("Array 2 is equal to Array 3? " + Arrays.equals(s2,s3));
        System.out.println("Array 1 is equal to Array 3? " + Arrays.equals(s1,s3));
    }
}
