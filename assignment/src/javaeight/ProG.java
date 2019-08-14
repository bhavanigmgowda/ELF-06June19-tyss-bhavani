package javaeight;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ProG {
	public static void main(String[] args) {
		StudentPro s1 = new StudentPro();
		StudentPro s2 = new StudentPro();
		StudentPro s3 = new StudentPro();
		StudentPro s4 = new StudentPro();
		s1.set("bhavani", 18, 67, "female");
		s2.set("ANJALI", 21, 77, "female");
		s3.set("sahana", 21, 87, "female");
		s4.set("vani", 22, 96, "male");

		ArrayList<StudentPro> t = new ArrayList<StudentPro>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);

		for (StudentPro s : t) {
			if (s.gender == "female") {
				s.name = "miss " + s.name;
			} else if (s.gender == "male") {
				s.name = "mr " + s.name;
			}
			log.info("name=" + s.name + "" + s.gender + "" + s.marks);
		}

	}
}
