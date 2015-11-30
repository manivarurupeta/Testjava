package packDemoDay2;

public class parametersizedMethod {
	
	
	public void method(){
		System.out.println("parameter less method");
	}
	
	public void methodP(int a){
		System.out.println("parameterized method  :"+a);
		
	}
	
	public void add(int a, int b){
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parametersizedMethod a=new parametersizedMethod();
		a.method();
		a.methodP(12);
		a.add(43, 54);

	}

}
