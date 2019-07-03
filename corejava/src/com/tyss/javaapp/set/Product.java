package com.tyss.javaapp.set;

public class Product implements Comparable<Product> {
	String name;
	int cost;
	double rate;
	@Override
	public int compareTo(Product o) {
		if(this.rate < o.rate)
		return 1;
		else if(this.rate> o.rate)
		return -1;
		else
			return 0;
	}
	/*@Override
	public int compareTo(Product o) {
		Double a=this.rate;
		Double b=o.rate;
		
		return a.compareTo(b);
	}*/
	

}
