import java.util.Scanner;
public class Matrix
{
  void multiply(int n)
  {   Scanner s=new Scanner(System.in); 
	  int a[][]=new int[n][n];
	  int b[][]=new int[n][n];
	  int c[][]=new int[n][n];
	  int i,j,k;
	  System.out.println("enter the values for first matrix");
	  for(i=0;i<n;i++)
	  {
		  for(j=0;j<n;j++)
		  {
			  a[i][j]=s.nextInt();
		  }
	  }
	  System.out.println("enter the values for second matrix");
	  for(i=0;i<n;i++)
	  {
		  for(j=0;j<n;j++)
		  {
			  b[i][j]=s.nextInt();
		  }
	  }
	  for(i=0;i<n;i++)
	  {
		  for(j=0;j<n;j++)
		  {
			  for(k=0;k<n;k++)
			  {
				  c[i][j]=c[i][j]+a[i][k]*b[k][j];
			  }
		  }
	  }
	  System.out.println("Resultant matrix is as follows");
	  for(i=0;i<n;i++)
	  {
		  for(j=0;j<n;j++)
		  {
			  System.out.print(c[i][j]+" ");
		  }
		  System.out.println();
	  }
	  s.close();
   }
  public static void main(String args[])
  {
	  Scanner x=new Scanner(System.in);
	  System.out.println("enter the no. of rows and column in square matrix");
	  int n=x.nextInt();
	  Matrix m=new Matrix();
	  m.multiply(n);
	  x.close();
	  
  }
}
