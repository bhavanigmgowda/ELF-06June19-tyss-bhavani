package com.tyss.javaapp.set;

public class Student implements Comparable<Student> {
	String name;
	int id;
	double per;

	void set(String name, int id, double per) {
		this.name = name;
		this.id = id;
		this.per = per;
	}
/*logic to sort student wrt percentage*/
	/*
	 * @Override public int compareTo(Student o) { if(this.per<o.per) return -1;
	 * else if(this.per>o.per) return 1; else return 0; }
	 */
	/*logic to sort student wrt id*/
	/*
	 * @Override public int compareTo(Student o) { if(this.id<o.id) { return -1; }
	 * else if(this.id>o.id) { return 1; } else {return 0; } }
	 */

	@Override
	public int compareTo(Student o) {
		/*
		 * String a=this.name; String b=o.name;
		 */
		return this.name.compareTo(o.name);
		
		
	}
	 


}
