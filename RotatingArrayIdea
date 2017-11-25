/*
 * clockwise rotate
 * first reverse up to down, then swap the symmetry 
 * 1 2 3     7 8 9     7 4 1
 * 4 5 6  => 4 5 6  => 8 5 2
 * 7 8 9     1 2 3     9 6 3
*/

Leetcode: 48. Rotate Image
My Solution:

public static void rotate(int[][] matrix) {
      int r=matrix.length;
      int c=matrix[0].length;
      
        //step 1
      for(int i=0;i<r/2;i++)
      {
          int[] temp=matrix[i].clone();
          matrix[i]=matrix[r-i-1].clone();
          matrix[r-i-1]=temp.clone();
      }
      
      int t;
      //step 2: Symmetric swap
      for(int i=0;i<r;i++)
      {
          for(int j=i;j<c;j++)
          {
              if(i==j)
                  continue;
              else
              {
                  t=matrix[i][j];
                  matrix[i][j]=matrix[j][i];
                  matrix[j][i]=t;
              }
          }
      }
      
      
      
      //printing
      for(int i=0;i<r;i++)
      {
          for(int j=0;j<c;j++)
          {
              System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
      }
}

/*
 * anticlockwise rotate
 * first reverse left to right, then swap the symmetry
 * 1 2 3     3 2 1     3 6 9
 * 4 5 6  => 6 5 4  => 2 5 8
 * 7 8 9     9 8 7     1 4 7
*/
