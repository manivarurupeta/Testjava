package packDemoDay2;

public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		B b=new B();
		parametersizedMethod p=new parametersizedMethod();
		
		p.method();
		p.methodP(21);
		p.add(32, 54);
		
		a.m1();
		a.m2();
		b.m3();

	}

}
