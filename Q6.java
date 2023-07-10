class Box<T>
{
	T type;
}
public class Q6
{
	public static void main(String args[]) {
		Box<String>b1=new Box<String>();
		Box<String>b2=b1;
		System.out.println(b1.type+" "+b2.type);
		b1.type="Hello";
		System.out.println(b1.type+" "+b2.type );
		Box<Integer> b3=new Box<Integer>();
		Box<Integer>b4=b3;
		System.out.println(b3.type+" "+b4.type);
		b3.type=56;
		System.out.println(b3.type+" "+b4.type);
		Box<Object>b5=new Box<Object>();
		Box<Object>b6=b5;
		System.out.println(b5.type+" "+b6.type);
		b5.type=78;
		System.out.println(b5.type+" "+b6.type);
		
	}
}