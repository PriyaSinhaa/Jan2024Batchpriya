package Package1;

public class Thismethod {
	
	public void m1()
	{   this.m5(0, 3, 5, 0);
		System.out.println("Default Method");
	}
    public void m2(int a)
    {   this.m1();
    	System.out.println("One parameterized method");
    }
    public void m3(int b, int c)
    {   this.m2(33);
    	System.out.println("Two parameterized method");
    }
    public void m4(int b, int c, int d)
    {
    	System.out.println("Three parameterized method");
    }
    public void m5(int b, int c, int d, int e)
    {   this.m4(4, 7, 8);
    	System.out.println("Four parameterized method");
    }
    
	public static void main(String[] args) {

		Thismethod obj=new Thismethod();
		obj.m3(45,35);
	}

}
