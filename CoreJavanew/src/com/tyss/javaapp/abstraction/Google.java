package com.tyss.javaapp.abstraction;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Google {
	private static final Logger loger = Logger.getLogger("google");

	void login() {
		loger.log(Level.SEVERE, " login ");
	}

	abstract void sharedoc();
}

class Gmail extends Google {
	private static final Logger loger = Logger.getLogger("google");

	void sharedoc() {
		loger.log(Level.SEVERE, "sharing gmail ");
	}
}

class Gdrive extends Google {
	private static final Logger loger = Logger.getLogger("google");

	void sharedoc() {
		loger.log(Level.INFO, "sharing google drive ");
	}
}
