package com.daily.java;

public class OverrideEqualsAndHashCode {

	private int key = 0;
	private int value = 0;
	private int storeSize = 10;

	public OverrideEqualsAndHashCode(int key, int value) {
		this.key = key;
		this.value = value;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof OverrideEqualsAndHashCode)) {
			return false;
		}
		OverrideEqualsAndHashCode obj1 = (OverrideEqualsAndHashCode) obj;
		return (key == obj1.key && value == obj1.value);
	}

	public int hashCode() {
		return key % storeSize;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideEqualsAndHashCode h1 = new OverrideEqualsAndHashCode(59, 101);
		OverrideEqualsAndHashCode h2 = new OverrideEqualsAndHashCode(79, 101);
		OverrideEqualsAndHashCode h3 = new OverrideEqualsAndHashCode(59, 101);

		if (h1.equals(h2)) {
			System.out.println("Objects h1 and h2 are equal" + " " + h1.hashCode() + " " + h2.hashCode());
		} else {
			System.out.println("Objects h1 and h2 are Not equal" + " " + h1.hashCode() + " " + h2.hashCode());
		}

		if (h1.equals(h3)) {
			System.out.println("Objects h2 and h3 are equal" + " " + h1.hashCode() + " " + h3.hashCode());
		} else {
			System.out.println("Objects h2 and h3 are Not equal" + " " + h1.hashCode() + " " + h3.hashCode());
		}

	}

}
