
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo m = new MethodsDemo();
		//m.name();
		System.out.println(m.name());
		MethodsDemo1 m1 = new MethodsDemo1();
		String result = m1.name();
		System.out.println(result);
		System.out.println(name1());

	}
	
	public String name() {
		System.out.println("Hi Rocky");
		return "Rocky";	}
	public static String name1() {
		System.out.println("Hi Nion");
		return "Rocky";	}

}
