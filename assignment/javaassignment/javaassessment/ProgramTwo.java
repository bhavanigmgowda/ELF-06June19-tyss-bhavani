package com.tyss.javaassessment;
/*3)	WAP for a method which returns ArrayList, LinkedList, Vector… based on the option entered*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import lombok.extern.java.Log;

@Log
public class ProgramTwo {

	public static void main(String[] args) {
		int choice = 2;
		List list=getListClass(choice);
		log.info("Class " + list.getClass());
	}

	public static List getListClass(int option) {
		if(option ==1) {
			return new ArrayList();
		}else if(option==2) {
			return new Vector();
		}else if(option==3) {
			return new LinkedList();
		}else {
			return null;
		}
		
	}

}
