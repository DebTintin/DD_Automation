package assignment301022_1;

public class Arithmetic1
{
   public int add (int a1, int a2)
  {
     int a3;
     a3=a1+a2;
     System.out.println("The sum after addition is "+a3);
     return a3;
  }
  public int sub (int b1, int b2)
  {
	 int b3;
	 b3=b1-b2;
	 System.out.println("The result after substraction is "+b3);
	 return b3;
  }
  public int multi (int c1, int c2)
  {
	  int c3;
	  c3=c1*c2;
	  System.out.println("The result after multification is "+c3);
	  return c3;
  }
  public void div (int d1, int d2)
  {
	  int result;
	  result=d1/d2;
	  System.out.println("The final result after division is "+result);
  }
  public static void main(String[] args)
  {
	Arithmetic1 Re = new Arithmetic1();
	int addresult = Re.add(10, 2);
	int addresult2 = Re.add(addresult, 2);
	int subresult = Re.sub(addresult2, 2);
	int mulresult = Re.multi(subresult, 2);
	Re.div(mulresult, 2);			
  }
}
  