package Sampletask;

public class Methodoverloading {

	public static void main(String[] args) {
	
			System.out.println(sub(5,2));
			System.out.println(sub(6,2.5));
			System.out.println(sub(10.5,5.5,3.1));
			System.out.println(sub(5.2,2.2));
			System.out.println(sub(8,2,3));
			Methodoverloading s2=new Methodoverloading();
			System.out.println(s2.sub(10, 5, 1, 2));
			
		}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static double sub(int c,double d)
	{
		return c-d;
	}
	public static double sub(double e,double f) {
		return e-f;
	}
	public static double sub(double e,double f,double g)
	{
		return e-f-g;
	}
	public static int sub(int a,int b,int c)
	{
		return a-b-c;
	}
	int sub(int a,int b, int c, int d)
	{
		return a-b-c-d;
	}
	

	}


