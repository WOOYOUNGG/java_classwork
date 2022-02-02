package koreait.day15;

import java.util.Scanner;

public class ExceptionTest1 {
	
	public static void main(String[] args) {
		//Exception 요약 : 문법오류가 아닙니다. 실행하면서 발생하는 오류입니다.(발생가능성을 고려해서 프로그래밍을 해야한다.)
		//		-> 원인에 따라 다른이름 xxxxException이 발생하고 이들은 Exeption 클래스의 자식 클래스입니다.
		//		-> Exception이 실행 중에 발생하면 그 이후는 ? ...프로그램이 그 시점부터 중단됩니다. 
		//		   ,Exception을 예상하고 프로그램이 중단되지 않도록 프로그램 구현을 해야합니다.
		
		//Exception 예시4 :
		//Wrapper 클래스(short, Integer, Double, Long....)에는 **문자열을 기본형타입**으로 변환하는 메소드가 있습니다.
//		int b = Integer.parseInt("abc");	//int b = Integer.parseInt("123");-> 정상적으로 실행	
				//정수로 변환할 수 없는 문자열은 NumberFormatException이 발생합니다.
//		System.out.println("b="+b);
		
		double c = Double.parseDouble("123,456,000.123");// Double.parseDouble("1234.567"); -> 정상적으로 실행
		System.out.println("c="+c);
		
		//Exception 예시3
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();			//키보드 입력을 정수로 변환해서 변수에 저장합니다.
					//사용자 입력한 문자에 숫자 외에 것이 있을 때 InputMismatchException이 발생합니다.
		//Exception 예시2
		int[] nums = new int[5];		//배열선언 : 요소 5개입니다. 
		nums[5]=100;		//실행했을 때 ArrayIndexOutOfBoundsException이 발생합니다. -> 인덱스 범위가 0~4기 때문에 오류난다.
		
		//1.Exception 예시1
		String message = null;
		
		
		char temp = message.charAt(0);		//message 문자열에서 첫 번째(0) 글자 1개 가져옵니다.
		//실행했을 때 NullPointerException이 발생합니다. -> 이유 : message 참조객체가 null이기 때문입니다.
		
		
		
		
		
		
		
		
		
	}

}
