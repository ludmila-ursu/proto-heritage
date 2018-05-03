package test;

import java.util.List;

public class B extends C {

	String m;
	int n;
	String s = null;

	public B(String m, int n, int k, String l) {
		super(k, l);
		this.m = m;
		this.n = n;
	}

	/**
	 * @return the m
	 */
	public String getM() {
		return m;
	}

	/**
	 * @param m
	 *            the m to set
	 */
	public void setM(String m) {
		this.m = m;
	}

	/**
	 * @return the n
	 */
	public int getN() {
		return n;
	}

	/**
	 * @param n
	 *            the n to set
	 */
	public void setN(int n) {
		this.n = n;
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
		B other = (B) obj;
		if (m == null) {
			if (other.m != null)
				return false;
		} else if (!m.equals(other.m))
			return false;
		if (n != other.n)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "B [m=" + m + ", n=" + n + "]";
	}

	public void toto() {
		System.out.println("Je suis dans le toto de B");
		this.n = 160;
	}

}
