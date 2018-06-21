//program to find number of words and spaces in a sentence
import java.util.Scanner;
public class Words_Spaces_in_a_sentence
{
    public static void main(String [ ]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the sentence:");
        String sentence=sc.nextLine();//next line is very imp.it odes not work with next
        String[] words=sentence.split(" " );
        //splits the string entered by user into array, so we get then get the length of the array
         System.out.println("The number of words in the sentence= " + words.length);
        int spaces=0,i=0;
        while ( i< sentence.length())
        {
            if(sentence.charAt(i)==' ' )
            {
                spaces++;
            }
            i++;
        }
        System.out.println("Number of spaces in the sentence= " + spaces);
    }
}
