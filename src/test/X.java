package test;

public class X {
	
	int x1 = 10;
	int x2 =20;
	Z z = new Z(0, 0);  //contenus dans la classe Z
	/**
	 * @param x1
	 * @param x2
	 * @param z
	 */
	public X(int x1, int x2, Z z) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.z = z;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "X [x1=" + x1 + ", x2=" + x2 + ", z=" + z + "]";
	}
	/**
	 * @return the x1
	 */
	public int getX1() {
		return x1;
	}
	/**
	 * @param x1 the x1 to set
	 */
	public void setX1(int x1) {
		this.x1 = x1;
	}
	/**
	 * @return the x2
	 */
	public int getX2() {
		return x2;
	}
	/**
	 * @param x2 the x2 to set
	 */
	public void setX2(int x2) {
		this.x2 = x2;
	}
	/**
	 * @return the z
	 */
	public Z getZ() {
		return z;
	}
	/**
	 * @param z the z to set
	 */
	public void setZ(Z z) {
		this.z = z;
	}

	
	
	

	
	
	
	
	
	
	

}
