//printing tables as 2d array
public class Tables_as_2d_array
{
public static void main(String[]args)
{
    int[] [] tables=new int [12][12];
    int i=1;//for row
    int j;//for column
    int count=1;
    do//for rows
    {
        j=1;//everytime loop runs value of j will be 1
        do
            {
            tables[i][j] = (i) * (j);
            System.out.print(tables[i][j] + " ");
            j++;
        } while(j<=tables.length-1);//j will be till 12
       System.out.println();
        i++;
    } while( i<=tables.length-1);//i will be till 12
}
}
