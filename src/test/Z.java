package test;

public class Z {
	
	int z1 = 50;
	int z2 = 60 ;
	
	//constructeur
	/**
	 * @param z1
	 * @param z2
	 */
	public Z(int z1, int z2) {
		super();
		this.z1 = z1;
		this.z2 = z2;
	}

	/**
	 * @return the z1
	 */
	public int getZ1() {
		return z1;
	}

	/**
	 * @param z1 the z1 to set
	 */
	public void setZ1(int z1) {
		this.z1 = z1;
	}

	/**
	 * @return the z2
	 */
	public int getZ2() {
		return z2;
	}

	/**
	 * @param z2 the z2 to set
	 */
	public void setZ2(int z2) {
		this.z2 = z2;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Z [z1=" + z1 + ", z2=" + z2 + "]";
	}
	
	
	
	
	
	
	
	

}
