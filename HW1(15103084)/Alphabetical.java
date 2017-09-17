import java.util.Scanner;
class Alphabetical {
	public static void main(String args[])
	{
  Scanner s=new Scanner(System.in);
  System.out.println("enter the no. of names you want to enter");
  int n=s.nextInt();
  String temp;
  String a[]=new String[n];
  Scanner t=new Scanner(System.in);
  System.out.println("Enter the names:");
  for(int i=0;i<n;i++)
  {
	  a[i]=t.nextLine();
  }
  for(int i=0;i<n;i++)
  {
	  for(int j=i+1;j<n;j++)
	  {
		  if(a[i].compareTo(a[j])>0)
		  {
			  temp=a[i];
			  a[i]=a[j];
			  a[j]=temp;
		  }
	  }
  }
  System.out.println("sorted name kist is:");
  for(int i=0;i<n;i++)
  {
	  System.out.print(a[i]+" ");
  }
  s.close();
  t.close();
}
}
