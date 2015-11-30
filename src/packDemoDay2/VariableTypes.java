package packDemoDay2;

public class VariableTypes {
	
	/*// static int a=5/0;
	static String name="Java";
	static String address="Bangalore";*/
	
	//Variable Types
	//instance variable
	//global variable
	//class variable
	//static variable
	//local variable
	
	//method signature
	static int y=20;//static variable or class variable
	int x;// non static variable or instance variable
	public void addMethod(){//non static method or instance method
		//local variable must have assign value
		int a=100;
		System.out.println(a);
		System.out.println(y);
		//System.out.println(x);
		//System.out.println(y);
	}
	

	public static void  main(String[] args) {//static main method
		//System.out.println(" "+name+" "+address+" I am good");
		int b=55;
		//System.out.println(b);
		//System.out.println(x);
		//System.out.println(y);
		VariableTypes v=new VariableTypes();
		v.addMethod();
		System.out.println(y);
	
		
		
	}

}
