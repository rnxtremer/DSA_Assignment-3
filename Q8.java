/*Write a recursive method in Java which, given an integer n, print it with its digits reversed.*/

public class Q8 {

	public static void Reverse(int n) {
		// TODO Auto-generated method stub
if(n<10)
{
	System.out.print(n);
}
	else
	{
		System.out.print(n%10);
		Reverse(n/10);
	}
}
	public static void main(String args[])
	{
		Reverse(456);
	}
	}


