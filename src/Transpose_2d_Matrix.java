//program to transpose 2D matrix
public class Transpose_2d_Matrix
{
    public static void main(String []args)
    {
        int[][] array =new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0; i<array.length;i++)//for printing the matrix/array
        {
            for( int j=0;j<array[i].length;j++)
            {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println("\n");
        }
        System.out.println("The inverse/transpose of the above array:");
        //System.out.println(array.length);
        if (array.length > 0)
        {
            for (int i = 0; i < array.length; i++)//for printing the transpose matrix/array
            {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[j][i] + " ");
                }
                System.out.println("\n");
            }
        }

    }
}
