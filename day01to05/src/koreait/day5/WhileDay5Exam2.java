package koreait.day5;

import java.util.Scanner;

public class WhileDay5Exam2 {	//오늘의 복습문제 구현합니다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password="";
		int upper_cnt=0, lower_cnt=0, numeric_cnt=0, symbol_cnt=0;
		boolean isOk=false;		//password 규칙에 맞는지 논리값 저장.
		String message="";			//password 규칙 불만족 사항.

		//연산에 사용되는 변수는 반드시 초기값을 저장합니다.
		
		System.out.println("[사용자 패스워드 검사]");
		
		while(!isOk) {	//isOk 거짓이면 !연산->참
			 upper_cnt=0;		//패스워드 다시 입력하면 초기화 해야할 값들이다.
			 lower_cnt=0;
			 numeric_cnt=0;
			 symbol_cnt=0;
			 message="";
			 
		System.out.print("사용할 패스워드 입력하세요. -> ");
		
		password = sc.next();
		
		if(password.length()<8) {
			message="1) 8글자 이상으로 합니다.";
		}
		for(int i=0;i<password.length();i++) {	//jungbo@#23 일 때 length()메소드는 10을 반환
//			System.out.println(password.charAt(i));
			char temp = password.charAt(i);
			if(temp>='A' && temp<='Z')
				upper_cnt++;//upper_cnt=upper_cnt +1;//대문자 개수증가
			else if(temp >= 'a' && temp <= 'z')
				lower_cnt++;//소문자 개수증가
			else if(temp>='0' && temp<='9')
				numeric_cnt++;//숫자 개수증가
			else if(temp>=32 && temp<=47 || temp >= 58 && temp <= 64 || temp >= 91 && temp <= 96 || temp >=123 && temp <= 126)
				symbol_cnt++;//기호 개수증가
		}	
		
		System.out.println("대문자 개수 : " + upper_cnt);
		System.out.println("소문자 개수 : " + lower_cnt);
		System.out.println("숫자 개수 : " + numeric_cnt);
		System.out.println("기호 개수 : " + symbol_cnt);
		
		if(upper_cnt < 1)
			message += "\n2) 영대문자 1개 이상 포함해야 합니다.";	//+문자열 연결
		if(lower_cnt < 1)
			message += "\n3) 영소문자 1개 이상 포함해야 합니다.";	//+문자열 연결
		if(numeric_cnt < 1)
			message += "\n4) 숫자 1개 이상 포함해야 합니다.";	//+문자열 연결
		if(symbol_cnt < 1)
			message += "\n5) 특수문자 1개 이상 포함해야 합니다.";	//+문자열 연결
		
		if(password.length()>=8 && upper_cnt >=1 && lower_cnt>=1 && numeric_cnt>=1 && symbol_cnt>=1)
			isOk=true;
		
		System.out.println(message);
		System.out.println("결과 : " + (isOk? "사용할 수 있는 패스워드 입니다." : "패스워드 작성 규칙에 맞지 않습니다."));
									//isOk 참일 때		콜론(:) 앞에 문자열 출력, 거짓이면 콜론(:) 뒤에 문자열 출력.
		
		}	//while end
		System.out.println("사용할 패스워드 : " + password);
		
		
		
	}

}
