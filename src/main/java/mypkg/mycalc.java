package mypkg;

public class mycalc {
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int diff(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	public void show()
	{
		System.out.println("GFG Show Function!!");
	}
	public void hello()
	{
		System.out.println("GFG Hello World Function!");
	}
    public static void main(String[] args) {
	mycalc calc = new mycalc();
	System.out.println("Sum is :"+calc.sum(20,10));
	System.out.println("Diff is :"+calc.diff(20,10));
	System.out.println("Multiplication is :"+calc.mul(20,10));
	System.out.println("Division is :"+calc.div(20,10));
    calc.show();
    calc.hello();
    }
}
