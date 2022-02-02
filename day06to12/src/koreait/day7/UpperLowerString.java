package koreait.day7;

import java.util.Scanner;

public class UpperLowerString {	
//처리내용 : message 입력문자열에서 대문자는 upper에 순서대로 모으고, 소문자는 lower에 순서대로 모아서 출력.
//	대문자 인덱스 변수 int k=0; 소문자 인덱스 int j=0; -> for 밖에서 선언하세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String message;
		String upper;	
		String lower;
		char[] uppers = new char[20];
		char[] lowers = new char[20];
		System.out.print("영문을 입력하세요 . -> ");
		message = sc.nextLine();
		int k=0;
		int j=0;
		
		for(int i=0;i< message.length();i++) {
			char temp= message.charAt(i);
			if(temp>='A' && temp<='Z') {
				uppers[k]=message.charAt(i);
			}else if(temp>='a' && temp<='z') {
				lowers[j]=temp;
			j++;	//다음 소문자 저장될 인덱스를 증가.
		}
	}	
		upper = String.valueOf(uppers);
		lower = String.valueOf(lowers);
		System.out.println("\n[[결과]]");
		System.out.println("대문자..."+ upper);
		System.out.println("소문자..." + lower);
		
	}

}
