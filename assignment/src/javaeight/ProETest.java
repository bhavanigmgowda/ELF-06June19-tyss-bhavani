package javaeight;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

 import org.junit.jupiter.api.Test;

class ProETest {

	static ProE p=new ProE();
	static ArrayList<Student> t=new ArrayList<Student>();
	static {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		s1.set("bhavani", 18, 67);
		s2.set("ANJALI", 21, 77);
		s3.set("sahana", 21, 87);
		s4.set("vani", 22, 96);
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
	
	}
	@Test
	void testTopper() {
		Double expecteds=96.00;
		Double actuals=p.getTopper(t);
		
		assertEquals(expecteds, actuals);
		
	}

}
