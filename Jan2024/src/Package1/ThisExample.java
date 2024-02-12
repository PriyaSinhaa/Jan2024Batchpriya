package Package1;

public class ThisExample {
	
	//default constructor
	ThisExample()
	{   this(1,2,3);
		System.out.println("Default constructor");
	}
	
	ThisExample(int a)
	{   this();
		System.out.println("One parameterized constructor");
	}
	ThisExample(int a, int b)
	{   this(1);
		System.out.println("Two parameterized constructor");
	}
	ThisExample(int a, int b, int c)
	{
		System.out.println("Three parameterized constructor");
	}
	ThisExample(int a, int b, int c, int d)
	{   
		this(1,2);
		System.out.println("Four parameterized constructor");
	}
	
	public static void main(String[] args) {
		
		ThisExample ob =new ThisExample(2,4,6,7);
		
		

	}

}
