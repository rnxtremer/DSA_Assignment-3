/*Create a class Student having two instance variable name and mark. Enter mark, name of the 
student. If mark is more than 100, create exception MarksOutOfBoundException & throw it 
using Java. Display the customised message Mark can’t be greater than 100 for the exception.*/

import java.util.Scanner;
class Student
{
	String name;
	double mark;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter your mark");
		mark=sc.nextDouble();
		try
		{
			if((mark=sc.nextDouble())>100)
			{
				throw new MarksOutOfBoundException("Mark can't be greater than 100");
			}
		}
		catch(MarksOutOfBoundException obj) 
		{
			System.out.println(obj.toString());
		}
	}
	void output()
	{
		System.out.println("Name is "+name+" & Mark is "+mark);
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s1=new Student();
        s1.input();
        s1.output();
	}

}