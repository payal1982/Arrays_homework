//program to write common elements in string arrays
import java.util.ArrayList;//used when we want to use more than 1 packages
import java.util.Arrays;
import java.util.List;

public class Common_elements_string
{
    public static void main(String []args) {
        String[] s1 = {"Payal", "Nitya", "Patel"};
        //to check the difference between printing string array and string array list
        System.out.println("Elements of First Array: ");
        for (String s_1 : s1) {
            System.out.print(s_1 +" ");
        }
        String[] s2 = {"Deepak", "Param", "Patel", "Nitya"};
        System.out.println("\nElements of Second Array: ");
        for (String s_2 : s2)
        {
            System.out.print(s_2 +" ");
        }
        String common=" ";
        System.out.println("\nCommon elements in both the arrays:");
        for (int i=0;i<s1.length;i++ )
        {
            for (int j=1;j<s2.length;j++)
            {
                if (s1[i]==s2[j])
                {
                    System.out.print(s1[i] + " ");
                }
            }
        }
        //System.out.println("The common elements in both the arrays are: " + s1list);
        /*List<String> s1list = Arrays.asList(s1);
        System.out.println("First array contains below elements:");
        for (String S1list : s1list) {
            System.out.println(S1list);
        }
        System.out.println("Second array contains below elements:");
        List<String> s2list = Arrays.asList(s2);
        for (String S2list : s2list) {
            System.out.println(S2list);
        }
        s1list.retainAll(s2list);//finds common elements*/
    }
}




