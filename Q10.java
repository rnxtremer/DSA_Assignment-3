/*Write a recursive Java method that takes a character string s and outputs its reverse. For
example, the reverse of ' pots&pans' would be ' snap&stop'.*/

import java.util.Scanner;
public class Q10 {

	public static void Reverse(String str) {
		// TODO Auto-generated method stub
if((str==null)||(str.length()==1))
{
	System.out.print(str);
}
	else
	{
		System.out.print(str.charAt(str.length()-1));
		Reverse(str.substring(0,str.length()-1));
	}
}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("Reverse of the String is: ");
		Reverse(str);
	}
	}

