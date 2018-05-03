package test;

public class A extends B {

	int x = 55;
	String y;

	public A(int x, String y, String m, int n, int k, String l) {
		super(m, n, k, l);
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX() {

		for (int i = 0; i < 20; i++) {
			int xxxx = 40;
			if (true) {
				System.out.println(xxxx);
			}
		}
	}

	/**
	 * @return the y
	 */
	public String getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(String y) {
		this.y = y;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (x != other.x)
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		return true;
	}

	 public void titi() {
		 
	 }
	
	
	@Override
	public void toto() {
		System.out.println("Je suis dans le toto de A");
//		System.out.println("x de A : "+x);
	}
}
