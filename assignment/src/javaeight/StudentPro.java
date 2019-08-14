package javaeight;

import java.util.logging.Logger;

public class StudentPro {
	private static final Logger log=Logger.getLogger("bhavani");

	String name;
	int id;
	double marks;
	String gender;

	void set(String name, int id, double marks,String gender ) {
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.gender = gender;

	}
	
	@Override
	public String toString() {
		return "name= "+ name+" id= "+id+" marks= "+marks;
	}

	void get() {
		log.info("name= "+name+"id= "+id+"marks= "+marks+"gender"+gender);
	}


}
