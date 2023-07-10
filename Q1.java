/*Write a Java program to read your lucky number from keyboard. Treat –ve no. as
NumberFormatException. Write appropriate Exceptional handler*/

import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("Enter your lucky number");
int n= sc.nextInt();
int lucky;
try
{
	if(n<0)
		throw new NumberFormatException("Negative Number");
	System.out.println("Your lucky Number is :"+n);
} 
catch(NumberFormatException E)
{
	System.out.println(E.toString());
}
	}

}