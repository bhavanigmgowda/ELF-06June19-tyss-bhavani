package com.tyss.assignment.javathree;

class TestA {
	public static void main(String[] args) {
		ProA s[] = new ProA[4];
		DB1 d = new DB1();

		for (int i = 0; i < s.length; i++) {
			s[i] = new ProA();
			// d[i]=new DB1();
		}
		s[0].setId(123);
		s[0].setName("bhavani");
		s[1].setId(456);
		s[1].setName("vani");
		s[2].setId(891);
		s[2].setName("ni");
		s[3].setId(321);
		s[3].setName("bha");
		for (int i = 0; i < s.length; i++)
			d.pass(s[i]);

	}
}