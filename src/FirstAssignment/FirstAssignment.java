package FirstAssignment;

class A{
	
	public void method_M1()
	{
		System.out.println("Class  A : Method m1");
	}
	
	public void method_M2()
	{
		System.out.println("Class  A : Method m2");
	}
	
	
	public void method_M3()
	{
		System.out.println("Class  A : Method m3");
	}
	
	
}

class B{
	
	public void method_M1()
	{
		System.out.println("Class  B : Method m1");
	}
	
	public void method_M2()
	{
		System.out.println("Class  B : Method m2");
	}
	
	
	public void method_M3()
	{
		System.out.println("Class  B : Method m3");
	}
	
	
}


class C
{
	
	public void method_M1()
	{
		System.out.println("Class  C : Method m1");
	}
	
	public void method_M2()
	{
		System.out.println("Class  C : Method m2");
	}
	
	
	public void method_M3()
	{
		System.out.println("Class  C : Method m3");
	}
	
	
}


public class FirstAssignment {

public void method_M1()
{
	System.out.println("Class  FirstAssignment : Method m1");
}

public void method_M2()
{
	System.out.println("Class  FirstAssignment : Method m2");
}


public void method_M3()
{
	System.out.println("Class FirstAssignment : Method m3");
}


public static void main(String args[])
{
	A a =new A();
	a.method_M1();
	a.method_M2();
	a.method_M3();

B b = new B();
b.method_M1();
b.method_M2();
b.method_M3();


C c = new C();
c.method_M1();
c.method_M2();
c.method_M3();

FirstAssignment fa = new FirstAssignment();
fa.method_M1();
fa.method_M2();
fa.method_M3();



}
}