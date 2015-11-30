package packDemoDay2;

 public class ConstructorExm {
	 
	 static final String country="India";
	 
	/*ConstructorExm() {
		System.out.println("default constructor....!!!!");
	}*/
	
	/* ConstructorExm(){//parameterless constructor
		 int a=1;
		int b=2;
		System.out.println("default constructor....!!!");
		System.out.println("addition of two numbers  :"+(a+b));
		System.out.println("subtraction of two numbers  :"+(a-b));
	}*/
	 
	/* ConstructorExm(int i){
		 System.out.println(i);
	 }*/
	 
	/* ConstructorExm(boolean b){
		 System.out.println(b);
	 }*/
	/*ConstructorExm(int i, int j){//parameterized constructor
		System.out.println("addition of two numbers  :"+(i+j));
	}*/
	/* ConstructorExm(float r) {
		float pi=3.14f;
		System.out.println("Circle area is  :"+(pi*r*r));
	}*/
	
	/*void areaOfCircle(){
		float pi=3.14f;
		float r=12.12f;
		System.out.println("Circle are is :"+(pi*r*r));
	}*/
	  ConstructorExm(String name, String address, String city) {
		 
		  /*{
			  country="India";
		  }*/
		System.out.println("Person name is :"+name+" ,His address  is : "+address+"  ,His city is  :"+city+" and his country is :"+country);
		
	}

	public static void main(String[] args) {
		
		ConstructorExm c1=new ConstructorExm("xyz", "Munokolelu", "Bangalore" );
		ConstructorExm c2=new ConstructorExm("abc", "Munokolelu", "Bangalore");
		//ConstructorExm c=new ConstructorExm();
		//c.areaOfCircle();
		//ConstructorExm c=new ConstructorExm(3.12f);
		//ConstructorExm c1=new ConstructorExm(4444);
		//ConstructorExm c3=new ConstructorExm(444764777);
		//ConstructorExm c2=new ConstructorExm(true);
		//ConstructorExm c1=new ConstructorExm(444);
		//ConstructorExm c2=new ConstructorExm(22, 32);

	}

}
