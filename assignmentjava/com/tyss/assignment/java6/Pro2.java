package com.tyss.assignment.java6;

import java.util.logging.Logger;

/*
 * WAP to cal factorial using lambda exp
 */
public class Pro2 {
	private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		Pro2Int f = (num) -> {
			int fa = 0;
			for (int i = 1; i <= num; i++)
				fa = i * i + 1;
			return fa;
		};
		int fa = f.fact(5);
		log.info(""+fa);

	}

}
