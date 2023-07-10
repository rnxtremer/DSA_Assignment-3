/*Write a java method using Generics to count the occurrence of an element in an array of any
type. The signature of count method is given below.

public static <T> int count(T[] array, T item)*/

public class Q5 {
public static <T> int count(T[]array, T item)
{
	int count=0;
	/*
	 for(int i=0;i<array.length;i++)
	 {
	 if(array[i]==item)
	 count++;
	 }
	 */
			for(T element:array) {
				if(element.equals(item))
					count++;
			}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[]IntegerArray={0,1,2,1,2,2,3};
int c =count(IntegerArray,2);
System.out.println("Occurence of 2 in this integer array ="+c);
Character[]CharacterArray= {'H','e','l','l','o'};
int c2=count(CharacterArray,'l');
System.out.println("occurence of l in this Character array ="+c2);
String str[]= { "ITER","SOA","ITER",};
int c3=count(str,"ITER");
System.out.println("occurence of ITER in this String array ="+c3);
	}

}