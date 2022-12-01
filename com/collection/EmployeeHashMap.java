package com.collection;

import java.util.HashMap;

public class EmployeeHashMap {

	private int id;
	private String name;

	public EmployeeHashMap(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + id; result = prime * result + ((name == null) ? 0 :
	 * name.hashCode()); return result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; EmployeeHashMap other = (EmployeeHashMap) obj; if (id != other.id)
	 * return false; if (name == null) { if (other.name != null) return false; }
	 * else if (!name.equals(other.name)) return false; return true; }
	 */

	public static void main(String[] args) {

		EmployeeHashMap e1 = new EmployeeHashMap(101, "Amit");

		EmployeeHashMap e2 = new EmployeeHashMap(101, "Amit");

		HashMap<EmployeeHashMap, String> hm = new HashMap<EmployeeHashMap, String>();

		hm.put(e1, "Hi");
		hm.put(e2, "Hello");

		System.out.println(hm.size());
	}

}
