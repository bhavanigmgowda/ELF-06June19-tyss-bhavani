package com.tyss.assignment.java5;

import java.util.TreeSet;

public class Pro6Test {
		public static void main(String[] args) {
			
			EmpById r=new EmpById();
			EmpBySal s=new EmpBySal();
			EmpByName n=new EmpByName();
			int key=1;		
			TreeSetPro6 p=new TreeSetPro6();

			TreeSet<Pro6Emp> t;
			switch (key) {
			case 1:
				 t=new TreeSet<Pro6Emp>(n);
			p.test(t);
				 break;
			case 2:
				t=new TreeSet<Pro6Emp>(r);
				p.test(t);

				break;
			case 3:
				t=new TreeSet<Pro6Emp>(s);
				p.test(t);

				break;
				
			default:
				System.out.println("invalid number");
				break;
			}

			
		}

	}

