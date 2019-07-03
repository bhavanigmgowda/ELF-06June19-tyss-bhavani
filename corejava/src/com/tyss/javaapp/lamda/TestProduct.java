package com.tyss.javaapp.lamda;

import lombok.extern.java.Log;

@Log
public class TestProduct {
public static void main(String[] args) {
	TestPro p=Product::new;
	Product p1=	p.get("pen",5.5);
	log.info("name="+p1.name+" cost="+p1.cost);
}
}
