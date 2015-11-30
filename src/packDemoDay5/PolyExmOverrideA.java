package packDemoDay5;

public class PolyExmOverrideA  extends PolyExmOverride{
	
	public void carHP100(){
		System.out.println("Car HP is equal to 75+25");
	}
	
	public static void main(String[] args){
		/*PolyExmOverride p=new PolyExmOverride();
		p.carHP100();*/
		PolyExmOverrideA c=new PolyExmOverrideA();
		c.carHP100();
	}

}
