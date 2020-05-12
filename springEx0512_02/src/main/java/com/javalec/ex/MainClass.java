package com.javalec.ex;

public class MainClass {

	public static void main(String[] args) {

		MyCalculatior mycal = new MyCalculatior();
		mycal.setCal(new Calculation());
		
		
		mycal.setFirstNum(10);
		mycal.setSecondNum(5);
		
		mycal.add();
		mycal.sub();
		mycal.multi();
		mycal.div();
		
	}

}
