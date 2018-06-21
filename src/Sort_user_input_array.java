//program to accept user input as array and then sort it
//Note: both integer and string arrays can be run individually, but when both are run together it shows error.
//Please guide
import java.util.*;
public class Sort_user_input_array
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        /*System.out.print("Enter the number of elements you want in the array:");
        int no_of_elements=sc.nextInt();
        int[] array=new int[no_of_elements];
        System.out.println("Enter all the elements:");
        for (int i=0;i<no_of_elements;i++)//loop for allowing user to enter the specific number of elements
        {
            array[i]=sc.nextInt();//all the elements are stored in the array
        }
        System.out.println("The array before sorting: ");
        for ( int array1:array)
        {
            System.out.print(array1 + " ");
        }
        Arrays.sort(array);//array is now sorted
        System.out.println("\nThe array after sorting: ");
        for ( int array2:array)
        {
            System.out.print(array2 + " ");
        }*/
        //sorting user input string array
        System.out.print("\nEnter the number of elements you want in the string array:");
        int no_of_elements_str=Integer.parseInt(sc.nextLine());
        String [] arraystr=new String[no_of_elements_str];
        System.out.println("Enter all the elements:");
        for (int i=0;i<arraystr.length;i++)//loop for allowing user to enter the specific number of elements
        {
            arraystr[i]=sc.next();//all the elements are stored in the array
        }
        System.out.println("The array before sorting: ");
        for ( String arraystr1:arraystr)
        {
            System.out.print(arraystr1 + " ");
        }
        Arrays.sort(arraystr);//array is now sorted
        System.out.println("\nThe array after sorting: ");
        for ( String  arraystr2:arraystr)
        {
            System.out.print(arraystr2 + " ");
        }

    }
}
