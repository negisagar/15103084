import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string");
		String str=sc.next();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equalsIgnoreCase(str))
		{
			System.out.println("String is palindrome");
		}
		else
			System.out.println("String is not palindrome");
		sc.close();
		
	}
}