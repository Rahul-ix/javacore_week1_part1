package types_of_variable;

public class A {

	static int x=10; //static variable
	int y=20;
	
	static A g= new A();
	public static void main(String[] args) {
		/*
		 * static variable : this variable is created outside method but inside class
		 * object creation is not required while calling static variable
		 * static variable intilization is not compulsory it takes default value
		 */
		
		System.out.println(x);//10--static variable calling or
		System.out.println(A.x);//10
		
		/*
		 * non-static variable: this variable are created outside method but inside class
		 * object creation is compulsory while calling non-stastic variable
		 * whenever you create object that many time it call non-static variable
		 */
		
//		System.out.println(y); error because object creation is compulsory
		A a1 = new A();
		System.out.println(a1.x);
		
		/*
		 * Garbage collector GC: it will remove the object from HEAP which address is not present in STACK
		 * 
		 */
		/*
		 * local variable: these variable are created inside method only
		 * initilization is compolsory
		 * 
		 */
		
		int z=30;
		System.out.println(z);
		/*
		 * refference variable: 2 types : local refference variable , global refference variable
		 * local refference variable: it is created inside method and you cannot access outside method
		 * 
		 */
		A p= new A();
		System.out.println(p);
		//global reference variable used only when it is static
		System.out.println(g);
		A.test();
		
	}
	
	static void test() {
//		System.out.println(p); error local refference variable
		System.out.println(g);//global refference variable
	}
}
