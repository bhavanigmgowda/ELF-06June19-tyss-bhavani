package com.tyss.javaapp.Set;

public class Car implements Comparable<Car>{
String name;
String brand;
int cost;
double rating;
@Override
public int compareTo(Car o) {
	return this.name.compareTo(o.name);
}

}
