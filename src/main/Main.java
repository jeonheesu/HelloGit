package main;

import calc.Calculator;

public class Main {

	public static void main(String[] args) {

		System.out.println("로컬 저장소 사용");
		System.out.println("원격 저장소 사용");
		System.out.println("원격 저장소 사용2");
		System.out.println("팀장 코드 시작입니다.");
		System.out.println("팀장 코드 마지막입니다..");

		System.out.println("팀장 새코드 시작");
		System.out.println("팀장 새코드 끝");

		System.out.println("팀장 코드 1..");
		System.out.println("팀장 코드 2..");
		System.out.println("팀장 코드 3..");
		
		
	 Calculator cal = new Calculator();
	 int addResult = cal.add(1, 2);
	 System.out.println(addResult);
	
	    int addResult1 = cal.subtraciton(8, 1);
	   System.out.println(addResult1);
	}

}
