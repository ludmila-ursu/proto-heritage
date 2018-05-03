package test;

public class Y {


	
	
	int y1 = 30;
	int y2 = 40;
	Z z = new Z(0, 0);
	
	
	//constructeur
	/**
	 * @param y1
	 * @param y2
	 * @param z
	 */
	public Y(int y1, int y2, Z z) {
		super();
		this.y1 = y1;
		this.y2 = y2;
		this.z = z;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Y [y1=" + y1 + ", y2=" + y2 + ", z=" + z + "]";
	}


	/**
	 * @return the y1
	 */
	public int getY1() {
		return y1;
	}


	/**
	 * @param y1 the y1 to set
	 */
	public void setY1(int y1) {
		this.y1 = y1;
	}


	/**
	 * @return the y2
	 */
	public int getY2() {
		return y2;
	}


	/**
	 * @param y2 the y2 to set
	 */
	public void setY2(int y2) {
		this.y2 = y2;
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
