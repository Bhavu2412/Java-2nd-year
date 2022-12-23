

public class Overloading {


	public int area(int x, int y) { return (x * y); }
	public int area(int x)
	{
		return (x*x);
	}
	public static void main(String args[])
	{
		Overloading s = new Overloading();
		System.out.println(s.area(10, 20));
		System.out.println(s.area(10));
	}
}
