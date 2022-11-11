package assignment061122_1;

public class Constructor2
{
  public void m1()
  {
	  this.m4 (1,2,3);
	  System.out.println("Default Method");
	  this.m5 (1,2,3,4);
	  this.m2 (1);
	  this.m3(1,2);
  }
  
  public void m2(int a)
  {
	  System.out.println("One Parameterized Method");
  }
  
  public void m3(int a, int b)
  {
	  System.out.println("Two Parameterized Method");
  }
  
  public void m4(int a, int b, int c)
  {
	  System.out.println("Three Parameterized Method");
  }
  
  public void m5(int a, int b, int c, int d)
  {
	  System.out.println("Four Parameterized Method");
  }
  
  public static void main(String[] args) 
  {
	Constructor2 obj = new Constructor2();
	obj.m1();
  }
}
