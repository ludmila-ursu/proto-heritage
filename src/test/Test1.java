package test;

public class Test1 {

	public static void main(String[] args) {

		A a = new A(20, "dqfsdf", "qdfsd ", 10, 20, "gfhj ");

		B b1 = (B) a;
		System.out.println(" b1.k:  "+b1.k);
		
		b1.setK(900);
		System.out.println(" b1.k:  "+b1.k);
		
		
		System.out.println(" a.k:  "+a.k);
	}
}
