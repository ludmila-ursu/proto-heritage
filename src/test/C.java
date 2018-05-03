package test;

import java.util.List;

public class C {

	int k = 700;
	String l = "toto"; 

	public C() {
		System.out.println("je suiis dans le constructeur [DEFAULT] de C");
		// plein de traiements
	}


	public C(List<String> l, String stg) {

	// un traitement
	}

	
	public C(int k) {
		this.k = k;
	}

	public C(int k, String l) {
		this.k = k;
		this.l = l;
	}

	public void fctC(int kkkkk, String lllllllllllllllll, boolean b, String stg, String str) {
		b = false;
	}
	

	public void fctC2() {
		k = 21;
	
	}

	/**
	 * @return the k
	 */
	public int getK() {
		return k;
	}

	/**
	 * @param k the k to set
	 */
	public void setK(int k) {
		this.k = k;
	}

	/**
	 * @return the l
	 */
	public String getL() {
		return l;
	}

	/**
	 * @param l the l to set
	 */
	public void setL(String l) {
		this.l = l;
	}


	/* (non-Javadoc)
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
		C other = (C) obj;
		if (k != other.k)
			return false;
		if (l == null) {
			if (other.l != null)
				return false;
		} else if (!l.equals(other.l))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "C [k=" + k + ", l=" + l + "]";
	}
	
	
	
	
}
