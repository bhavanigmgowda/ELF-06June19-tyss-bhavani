package qspider;

import com.TYSS.Calculator.Basic.BasicCalculator;

public class Testcard {
	public static void main(String[] args) {
		card j=new card();
		card a=new card();
		j.swipe();
		a.swipe();
		j.swipe();
		j.swipe();
		System.out.println("java class count"+j.count);
		System.out.println("ANGULAR class count"+a.count);
		System.out.println("organization"+card.orgcount);
		BasicCalculator b=new BasicCalculator();
		b.add(10,20);
		
	}
}
