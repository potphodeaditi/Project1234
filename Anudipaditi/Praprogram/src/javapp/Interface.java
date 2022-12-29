package javapp;

interface Printable
{
	void show();
}
interface Calculate
{
	int calcu(int i);
}
class Cal_square implements Printable,Calculate
{
	public void show()
	{
		System.out.println("Square of a Number is =");
	}
	
	public int calcu(int a)
	{
		return a*a;
	}
	
}
class Cal_cube implements Printable,Calculate
{
	public void show()
	{
		System.out.println("Cube of a Number is=");
	}
	public int calcu(int a)
	{
		return a*a*a;
	}
}

public class Interface {

	public static void main(String[] args) {
		Cal_square cq=new Cal_square();
		cq.show();
		System.out.println(cq.calcu(4));
		Cal_cube cc=new Cal_cube();
		cc.show();
		System.out.println(cc.calcu(6));
		// TODO Auto-generated method stub

	}

}
