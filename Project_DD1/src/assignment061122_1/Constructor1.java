package assignment061122_1;

public class Constructor1 
{
	
  public Constructor1()
  {
	this (10, 20, 30, 40);
	System.out.println("Default Constructor");
  }
  public Constructor1(int a)
  {
	this ();
	System.out.println("One Parameterized Constructor");
  }
  
  public Constructor1(int a, int b)
  {
	this (22, 33, 44);
	System.out.println("Two Parameterized Constructor");
  }
  
  public Constructor1(int a, int b, int c)
  {
	this (10);
	System.out.println("Three Parameterized Constructor");
  }
  
  public Constructor1(int a, int b, int c, int d)
  {
	System.out.println("Four Parameterized Constructor");
  }
  
  public static void main(String[] args)
  {
  Constructor1 obj1 = new Constructor1 (33, 44);
  }  
}
