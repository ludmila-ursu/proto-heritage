package test;

public class Test2 {

	public static void main(String[] args) {

		
		X x = new X(100, 101, new Z(102, 103));
		System.out.println("z1 contenu dans le Z de X : " + x.getZ().getZ1());
		System.out.println("z2 contenu dans le Z de X : " + x.getZ().getZ2());

		Y y = new Y(x.getX1(), 201, x.getZ());
		System.out.println(y);
		
		y.setY1(200);
		System.out.println(y);
		
		System.out.println("x1 contenu dans X: "+x.getX1());
		//System.out.println(s.toto); //s cannot be resolved to a variable
	}

}
