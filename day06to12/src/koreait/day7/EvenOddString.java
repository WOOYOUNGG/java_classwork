package koreait.day7;

import java.util.Scanner;

public class EvenOddString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String src_string;
		String odd_string="";
		String even_string="";
		
		System.out.print("문자열(공백과 기호, 숫자 포함)을 입력하세요. -> ");
		src_string = sc.nextLine();

		
		for(int i=0;i<src_string.length();i++) {
			
	
			if(i%2==0) even_string +=src_string.charAt(i);
			
			else odd_string +=src_string.charAt(i);
		}			
		System.out.println("\n[[결과]]");
		System.out.println("짝수 문자열 : " + even_string);
		System.out.println("홀수 문자열: " + odd_string);
	}
}