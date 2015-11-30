package packDemoDay2;

public class IntegerSize {
	
	static short s;
	static short sMax=Short.MAX_VALUE;
	static short sMin=Short.MIN_VALUE;
	static int i;//static integer variable(i)
	//int i;//non static integer variable
	static int iMax=Integer.MAX_VALUE;
	static int iMin=Integer.MIN_VALUE;
	
	static long l;
	static long lMax=Long.MAX_VALUE;
	static long lMin=Long.MIN_VALUE;
	public static void main(String[] args) {
		System.out.println("***************Short****************");
		System.out.println("Short default value is  :"+s);
		System.out.println("Short Max Value is  :"+sMax);
		System.out.println("Short Min Value is  :"+sMin);
		System.out.println();
		System.out.println("***************Int****************");
		System.out.println("Integer default value is  :"+i);
		System.out.println("Integer Max Value is  :"+iMax);
		System.out.println("Integer Min Value is  :"+iMin);
		System.out.println();
		System.out.println();
		System.out.println("***************Long****************");
		System.out.println("Long default value is  :"+l);
		System.out.println("Long Max Value is  :"+lMax);
		System.out.println("Long Min Value is  :"+lMin);

	}

}
