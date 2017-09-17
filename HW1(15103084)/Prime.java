import java.util.Scanner;
public class Prime 
{
  void seive(int n)
  {
	  int a[]=new int[n+1];
	  int i;
	  for(i=0;i<=n;i++)
		  a[i]=0;
	  for(int p=2;p*p<=n;p++)
	  {
		  if(a[p]==0)
		  {
			  for(i=p*2;i<=n;i+=p)
			  {
				  a[i]=1;
			  }
		  }
	  }
	  System.out.println("prime numbers are");
	  for(i=2;i<=n;i++)
	  {
		  if(a[i]==0)
			  System.out.print(i+"  ");
	 }
   }
  public static void main(String args[])
  {   Prime p=new Prime();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the range within which prime no. is to be found");
	  int m= sc.nextInt();
	  p.seive(m);
	  sc.close();
  }
}
