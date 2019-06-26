package com.tyss.assignment.javafive;

import java.util.TreeSet;
import java.util.logging.Logger;

/*
 * WAP to sort the mobile object based on the price
 */
public class ProFiveTest {

private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		TreeSet<MobilePro5> t = new TreeSet<MobilePro5>();
		MobilePro5 m1 = new MobilePro5();
		m1.set("MI", 20000, "MI");
		MobilePro5 m2 = new MobilePro5();
		m2.set("IPhone", 100000, "apple");
		MobilePro5 m3 = new MobilePro5();
		m3.set("note 2 MI ", 8000, "MI");
		MobilePro5 m4 = new MobilePro5();
		m4.set("galaxy 2", 20000, "sam");
		MobilePro5 m5 = new MobilePro5();
		m5.set("note 5", 20000, "sam");
		t.add(m1);
		t.add(m2);
		t.add(m3);
		t.add(m4);
		t.add(m5);

		for (MobilePro5 p : t) {
			log.info("name=" + p.name + " cost= " + p.cost + " brand=" + p.brand);
		}
	}

}
