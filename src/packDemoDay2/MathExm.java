package packDemoDay2;

public class MathExm {
	
	int a=45;
	int b=20;
	
	public void add(){
		System.out.println("Addition of a and b :"+(a+b));
	}
	
	public void sub(){
		System.out.println("Subtraction of a and b :"+(a-b));
	}

	public static void main(String[] args) {
		MathExm m=new MathExm();
		m.add();
		m.sub();

	}

}
