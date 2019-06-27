package com.tyss.javaapp.implamda;

import lombok.extern.java.Log;

@Log
public class TestC {
	public static void main(String[] args) {
		String s="banana";
		
		switch (s) {
		case "apple":log.info("apple");
			break;
		case "banana":log.info("banana");
		break;
		case "berry":log.info("berry");
		break;
		default:
			break;
			
			
			
		}
	}

}
