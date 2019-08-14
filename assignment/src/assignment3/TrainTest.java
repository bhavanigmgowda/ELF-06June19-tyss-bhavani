package assignment3;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class TrainTest {

	public static void main(String[] args) {

		Train t1 = new Train("basava", 123);
		Train t2 = new Train("rajarani", 456);
		Train t3 = new Train("shatabdi", 745);
		Train t4 = new Train("hjj", 3645);

		Comparator<Train> t = (i, j) -> {
			Integer a = i.number;
			Integer b = j.number;

			return a.compareTo(b);
		};
		Comparator<Train> c = (i, j) -> {

			return i.name.compareTo(j.name);
		};

		TreeSet<Train> al = new TreeSet(t);
		al.add(t1);
		al.add(t2);
		al.add(t3);
		al.add(t4);

		for (Train train : al) {
			log.info(" " + train.name + " " + train.number);
		}

	}

}
