//program to sort integer and string array
import java.util.Arrays;
public class Sort_arrays
{
    void numbers_sorting()//instance method
    {
        int[] numbers = {38, 12, 89, 76, 94};
        System.out.println("The array before sorting:");
        for (int num : numbers)
        {
            System.out.println(num);
        }
        Arrays.sort(numbers);//inbuilt method to sort arrays
        System.out.println("Array after sorting:");
        for (int num1 : numbers)
        {
            System.out.println(num1);
        }
    }

    void string_sorting ()
    {
        String[] names = {"Payal", "Deepak", "Nitya", "Param", "Patel"};
        System.out.println("The array before sorting:");
        for (String names1 : names)//in built method to sort arrays
        {
              System.out.println(names1);
        }
        Arrays.sort(names);
        System.out.println("Array after sorting:");
        for (String names2 : names)
        {
            System.out.println(names2);
        }
    }
public static void main(String [] args)
{
    Sort_arrays sa=new Sort_arrays();//object created to call the instance methods
    sa.numbers_sorting();
    sa.string_sorting();
}


}
