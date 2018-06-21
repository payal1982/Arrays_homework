//program to inssert an element in specific position in an array
public class Insert_element_Spec_position
{
    public static void main (String[] args)
    {
        int[] a= new int [5];//array of fixed size declared and initiated
        a[2]=3;//element at specific position inserted
        for ( int i=0;i<=a.length-1;i++)//loop to print the array. default values of int is 0.
        {
            System.out.println(" Elements at position " + i + " is " + a[i]);
        }
        String[] str=new String[7];
        str[0]="Payal";
        str[5]="Book";
        System.out.println("Element at position 0 is " + str[0]+ ".");//for printing individual elements from the string
        System.out.println("Element at position 5 is " + str[5]+ ".");
        for ( int i=0;i<=str.length-1;i++)//loop to print the array. default values of string is null.
        {
            System.out.println(" Elements at position " + i + " is " + str[i]);
        }

    }
}
