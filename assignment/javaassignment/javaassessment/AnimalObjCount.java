package com.tyss.javaassessment;
/*5)	WAP to count the type of objects present in the ArrayList.
Eg: ArrayList has 20 Animal type objects, your program as to give me the count of Cow, Lion, Dog objects present inside it. */
import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class AnimalObjCount {

	public static void main(String[] args) {
		ArrayList<Animal> arrayList=new ArrayList<>();
		arrayList.add(new Dog());
		arrayList.add(new Lion());
		arrayList.add(new Cat());
		arrayList.add(new Lion());
		arrayList.add(new Dog());
		arrayList.add(new Lion());
		arrayList.add(new Lion());
		
		getCount(arrayList);
		
	}
	static void getCount(ArrayList<Animal> list) {
		int dogCount=0;
		int catCount=0;
		int lionCount=0;
		for(int i=0;i<list.size();i++) {
		if(list.get(i) instanceof Dog) {
			dogCount++;
		}else if(list.get(i) instanceof Cat) {
			catCount++;
		}else if(list.get(i) instanceof Lion) {
			lionCount++;
		}else {
			log.info("Null");
		}
			
		}
		log.info("Count of Dog Object :"+dogCount);
		log.info("Count of cat Object :"+catCount);
		log.info("Count of Lion Object :"+lionCount);
	}

}
