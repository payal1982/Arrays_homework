import java.util.Arrays; //i understand that for arrays, we have to use the array package everytime
public class Specific_Value
{

    public static void main(String[] args)
    {
        int[] array={1,2,3,4,5};//array declared, initiated at the same time
       /* for(int i=0;i<=array.length-1;i++)
        {
            System.out.print(array[i] + " ");
        }*/
       //tried both the for and for each loop for printing both working fine
        for (int aa:array)//tried the for each loop, as it seems quite simple in use
        {
            System.out.print(aa + ",");
        }
        int index=Arrays.binarySearch(array,4);
        System.out.println("\nNumber 4 is at index position " + index + " in the array");

    }
}
