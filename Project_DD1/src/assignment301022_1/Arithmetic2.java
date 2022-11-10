package assignment301022_1;

public class Arithmetic2 
{
   public int add (int a1, int b1)
   {
	   int c1;
	   c1=a1+b1;
	   System.out.println("The result after addition is "+c1);
	   return c1;	   
   }
   public int sub (int a2, int b2)
   {
	   int c2;
	   c2=a2-b2;
	   System.out.println("The result after substraction is "+c2);
	   return c2;
   }
   public int multi (int a3, int b3)
   {
	   int c3;
	   c3=a3*b3;
	   System.out.println("The result after multiplication is "+c3);
	   return c3;
   }
   public void div (int a4, int b4)
   {
	   int c4;
	   c4=a4/b4;
	   System.out.println("The final result after division is "+c4);
   }
   public static void main(String[] args) {
	Arithmetic2 Res = new Arithmetic2();
	int mulresult = Res.multi(10, 2);
	int addresult = Res.add(mulresult, 2);
	int subresult = Res.sub(addresult, 2);
	int subresult2 = Res.sub(subresult, 2);
	Res.div(subresult2, 2);
}
}
