package methods;

public class A {
public static void main(String[] args) {
	/*
	 * methods: it is used for reusable code
	 * if method is void not allowed return value keyword
	 * you can write return key it is optional
	 * note: other  than void like int,string etc you need to write return value keyword
	 * if method is static you call call method directly without creating object
	 */
	System.out.println(A.sub(20, 10));//static method

	A a = new A();
	System.out.println(a.add(10, 20));//re-usable and other than void method
	
	a.test();//void method
	
	
}

int add(int x,int y) {
	return x+y;
}
void test() {
	System.out.println("test");
	return;//optional return
}

static int sub(int x , int y) {
	return x-y;//complosry return value
}

/*
 *  return: this keyword used when method is void and it is optional
 *  it is calls method calling statement
 *  
 *  return value: this keyword used method is int,string,float boolean etc
 *  and return value is complsory
 */
}
