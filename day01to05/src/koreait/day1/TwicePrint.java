package koreait.day1;	//koreait.day1은 패키지 이름

public class TwicePrint {	//PrintTest는 클래스 이름. 시작은 반드시 대문자로.

	public static void main(String[] args) {
		
		System.out.println("트와이스");
		//syso 입력후 ctrl + 스페이스바로 자동완성.
		System.out.println("-----------------------");
		System.out.println("사나\t1996.12.29");
		System.out.println("지효\t1996.02.01");
		System.out.println("미나\t1996.12.24");
		System.out.printf("%-10s %s\n","다현","1998.05.28");
		System.out.printf("%-10s %s\n","채영","1996.12.23");
		System.out.printf("%-10s %s\n","쯔위","1996.06.14");
		System.out.println();

	}
	// \n, 't : 특정기능문자(이스케이프 문자 \로 시작합니다.)
}
