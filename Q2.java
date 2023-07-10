/*Assign your favourite colours in an array. Identify 2 exceptions that may be generated & write
exceptional handler in Java. Also, display the four colours after handling any 2 exceptions.*/


import java.util. Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]=new String[5];
Scanner sc = new Scanner(System.in);
System.out.println("Enter your four Color");
for(int i=0;i<4;i++)
{
	str[i]=sc.nextLine();
}
try
{
	Integer i=Integer.parseInt(str[0]);
}
catch(NumberFormatException e)
{
	e.printStackTrace();
}

try {
	System.out.println("Enter one more Color");
	str[4]=sc.nextLine();
}
catch(ArrayIndexOutOfBoundsException e)
{
	e.printStackTrace();
}
	}

}