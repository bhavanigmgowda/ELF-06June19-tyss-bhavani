package com.tyss.assignment.javafive;

import java.util.TreeSet;
import java.util.logging.Logger;

public class ProSixTest {

private static final Logger log=Logger.getLogger("bhavani");
	
	public static void main(String[] args) {
			
			EmpById r=new EmpById();
			EmpBySal s=new EmpBySal();
			EmpByName n=new EmpByName();
			int key=1;		
			TreeSetProSix p=new TreeSetProSix();

			TreeSet<ProSixEmp> t;
			switch (key) {
			case 1:
				 t=new TreeSet<ProSixEmp>(n);
			p.test(t);
				 break;
			case 2:
				t=new TreeSet<ProSixEmp>(r);
				p.test(t);

				break;
			case 3:
				t=new TreeSet<ProSixEmp>(s);
				p.test(t);

				break;
				
			default:
				log.info("invalid number");
				break;
			}

			
		}

	}

