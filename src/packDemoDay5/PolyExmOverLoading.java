package packDemoDay5;

public class PolyExmOverLoading {
	
	void add(int a, int b){
		System.out.println("Addition of two numbers   :"+(a+b));
	}
	private void add(int a, int b,int c){
		System.out.println("Addition of three numbers   :"+(a+b+c));
	}

	public static void main(String[] args){
		PolyExmOverLoading o=new PolyExmOverLoading();
		o.add(32, 12);
		o.add(11, 22, 33);
	
	}
}
