package Package1;

public class Student {
	
	static int rollNo;
	int age;
	
	public void display()
	{
		System.out.println("Welcome to all of you ");
	}

	public void display2()
	{
		System.out.println("Automation is very easy ");
	}
	
	public static void main(String[] args) 
	{
      Student ob=new Student();
      ob.rollNo=28;
      ob.age=16;
      ob.display();
      ob.display2();
      System.out.println("Roll No is"+" "+rollNo );
      
      
	}

}
