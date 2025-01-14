package data_types;

public class A {

	int x1;
	float x2;
	char x3;
	String x4;
	long x5;
	double x6;
	boolean x7;
	public static void main(String[] args) {
		/*
		 * data types: int, float .long,char boolean double
		 * note: String is class
		 */
		
		A a1 = new A();
		System.out.println(a1.x1);
		System.out.println(a1.x2);
		System.out.println(a1.x3);
		System.out.println(a1.x4);
		System.out.println(a1.x5);
		System.out.println(a1.x6);
		System.out.println(a1.x7);
		
		// var : is dynamic data type and it is used only as local variable it means initilization
		//is compulsory
		
		var v1=10;
		var v2='c';
		var v3="hello";
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
	}
}
