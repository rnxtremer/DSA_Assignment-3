/*Write a java program to print an array of different type using a single Generic method. The
signature of printArray method is given below.

public static < E > void printArray( E[] inputArray)*/


public class Q4 {
	public static<E> void printArray(E[]inputArray)
	{
		for(int i=0;i<inputArray.length;i++)
		{
			System.out.print(inputArray[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer IntArray[]= {1,2,3,4,5};
System.out.println("Element of interger array are : ");
printArray(IntArray);
Double DoubleArray[]= {1.1,1.2,1.3,1.4,1.5};
System.out.println("Element of Double Array are");
printArray(DoubleArray);
Character CharacterArray[]={'A','B','C','D','E'};
System.out.println("Element of Character Array");
printArray(CharacterArray);
	}
}