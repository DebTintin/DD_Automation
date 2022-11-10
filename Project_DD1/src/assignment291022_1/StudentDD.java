package assignment291022_1;

public class StudentDD
{
	int Rollno, Age;
	
	public void Display1 ()
	{
      System.out.println("Welcome to all of you");
	}
	public void Display2 ()
	{
		System.out.println("Automation is easy");
	}
	public static void main(String[] args) {
		StudentDD Tintin = new StudentDD ();
		Tintin.Display1();
        Tintin.Display2();
		Tintin.Rollno = 88;
		System.out.println(Tintin.Rollno);
		Tintin.Age = 37;
		System.out.println(Tintin.Age);
	}
}
