package com.tyss.javaapp.stream;

import lombok.extern.java.Log;

public interface Demo {
	void print(int x);

}
@Log
class Pen{
	void write(int x) {
		log.info(""+x);
	}
}