import java.util.Arrays; //i understand that for arrays, we have to use the array package everytime
public class Specific_Value
{

    public static void main(String[] args)
    {
        int[] array={1,2,3,4,5};//array declared, initiated at the same time
       /* for(int i=0;i<=array.length;i++)
        {
            System.out.println(array[i]);
        }*/
       //cannot understand why exception thread error is there when i try to run program with this method
        for (int aa:array)//tried the for each loop, as it seems quite simple in use
        {
            System.out.print(aa + ",");
        }
        int index=Arrays.binarySearch(array,4);
        System.out.println("\nNumber 4 is at index position " + index + " in the array");

    }
}
