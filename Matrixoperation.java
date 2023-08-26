import java.util.Scanner;

class Matrix
{
      int row;
      int col;
     
      int[][] firstMatrix;
      int[][] secondMatrix;

      public void CreateMatrix()
      {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of rows in firstmatrix : ");
            row = sc.nextInt();
            System.out.println("Enter number of columns in firstmatrix : ");
            col = sc.nextInt();
            firstMatrix = new int[row][col];

            System.out.println("Enter number of rows in secondmatrix : ");
            row = sc.nextInt();
            System.out.println("Enter number of columns in secondmatrix : ");
            col = sc.nextInt();
            secondMatrix = new int[row][col];

            System.out.println("Enter first Matrix : ");
            for(int r=0; r<row; r++)
            {
               for(int c=0; c<col; c++)
               {
                   firstMatrix[r][c] = sc.nextInt();
               }
            }
            System.out.println("Your first Matrix is : ");
            for(int r=0; r<row; r++)
            {
               for(int c=0; c<col; c++)
               {
                  System.out.print(firstMatrix[r][c] +"\t");
               }
               System.out.println();
            }

            System.out.println("Enter second Matrix : ");
            for(int r=0; r<row; r++)
            {
                for(int c=0; c<col; c++)
                {
                      secondMatrix[r][c] = sc.nextInt();
                }
            }
           System.out.println("Your second Matrix is : "); 
           for(int r=0; r<row; r++)
            {
                for(int c=0; c<col; c++)
                {
                      System.out.print(secondMatrix[r][c]+"\t");
                }
                System.out.println();
            }
      }

      public void AddMatrix()
      {
          int[][] Addmatrix = new int [row][col];
       
          System.out.println("Addition of Matrix is : ");
          for(int r=0; r<row; r++)
          {
              for(int c=0; c<col; c++)
              {
                   Addmatrix[r][c] = firstMatrix[r][c] + secondMatrix[r][c];
                   System.out.print(Addmatrix[r][c]+"\t");
              }
              System.out.println();
          }
      }
      public void SubMatrix()
      {
          int[][] Submatrix = new int [row][col];
       
          System.out.println("Substration of Matrix is : ");
          for(int r=0; r<row; r++)
          {
              for(int c=0; c<col; c++)
              {
                   Submatrix[r][c] = firstMatrix[r][c] - secondMatrix[r][c];
                   System.out.print(Submatrix[r][c]+"\t");
              }
              System.out.println();
          }
      }
      public void MulMatrix()
      {
           int[][] mulmatrix = new int[row][col];

           System.out.println("Multiplication of Matrix is : ");
           for(int r=0; r<row; r++)
           {
                for(int c=0; c<col; c++)
                {
                     mulmatrix[r][c] = 0;
                     for(int k=0; k<col; k++)
                     {
                          mulmatrix[r][c] += firstMatrix[r][k] * secondMatrix[k][c];
                          
                     }
                    System.out.print(mulmatrix[r][c]+"\t");
                }
                System.out.println(); 
           }
      }
}
class Matrixoperation
{
       public static void main(String[] args)
       { 
            Matrix M = new Matrix();
            M.CreateMatrix();
            M.AddMatrix();
            M.SubMatrix();
            M.MulMatrix();
       }
}