package com.sist.temp;
class Super
{
	int a=10;
	int b=20;
	public Super()
	{
		System.out.println("Super()  Call");
	}
	}
class Sub extends Super
{
	public Sub() 
	{
		System.out.println("Sub() Call");
	}
	public void display()
	{
		super.a=100;
		super.b=200;
		this.a=1000;
		this.b=2000;
		System.out.println("super:a="+super.a);
		System.out.println("super:b="+super.b);
		System.out.println("super:a="+this.a);
		System.out.println("super:a="+this.b);
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
