//program to find duplicate values in integer array
public class Duplicate_elements
{
    public static void main(String[] args)
    {
        int[] a = {2, 4, 1, 5, 2, 4, 6,2};
        int i, j;
        System.out.println("Duplicate elements in the array are:");//before loop, so that the sentence prints only once
        for (i = 0; i <= a.length - 1; i++)//length-1, so that the array out of bounds error does not occur, as it is i++
        {

            for (j = i + 1; j < a.length; j++)//need to check till the last element, so no-1 and also it is just< than not <=
            {
                if (a[i] == a[j])//checks if the values are same
                    System.out.println(a[i]);
            }
        }
    }
}
