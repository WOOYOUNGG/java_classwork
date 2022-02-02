package koreait.day3;

import java.util.Scanner;

public class ElseIfTest {

	public static void main(String[] args) {
		int point;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("포인트 입력하세요. -> ");
		point = sc.nextInt();
		//if문의 형식2 : if(조건관계식1) {...A...}		//조건관계식1이 참일 때
//		else if(조건관계식2)
//		{...B...}					//조건관계식1은 거짓, 조건관계식 2는 참일 때
//		else
//		{...C...}					//조건관계식1은 거짓, 조건관계식 2는 거짓일 때
		//응용 : point 가 150이상이면 사과세트를, 100~149 이면 귤세트, 50~99이면 과자세트를, 0~49이면 5000원 상품권.
		
		System.out.print("설날 증정선물 : ");
		
		if(point >= 150) 
			System.out.println("사과 선물세트");
		else if(point >= 100)
			System.out.println("귤 선물세트");
		else if(point >=50)
			System.out.println("과자 선물세트");
		else
			System.out.println("모바일 5000원 상품권");
		
		
		
		sc.close(); // Scanner 타입 변수 사용 종료
		
		//리소스(자원) : 입출력 클래스는 메모리 등 추가적인 지원 사용하므로 해제도 필요로 합니다.
		
		

	}

}
