package packDemoDay2;

public class VariableExm {
	
	int i;//non static variable or instance variable
	static String name;//static variable or class variable
	final String address="Marthahalli";//random variable or final variable
	static final String city="Bangalore";//constant variable
	//can we create static final or constant variable in side the method? no
	//can we create final variable in side the method? yes
	public void locationVY(){
		final String address="Amerpeta";
		//static final String city="Hyderabad";
		System.out.println("Address of Vijay  :"+address);
		System.out.println("Address of Vijay  :"+city);
	}
	public void locationSY(){
		System.out.println("Address of Sandya   :"+address);
		System.out.println("Address of Sandya  :"+city);
	}
	
	public void locationMK(){
		System.out.println("Address of Mani   :"+address);
		System.out.println("Address of Mani  :"+city);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableExm v=new VariableExm();
		v.locationMK();
		v.locationSY();
		v.locationVY();

	}

}
