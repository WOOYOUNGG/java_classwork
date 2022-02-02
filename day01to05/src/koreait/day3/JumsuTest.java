package koreait.day3;

import java.util.Scanner;

public class JumsuTest {

	public static void main(String[] args) {
		
		int korean, english, science, sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[성적 집계 : 평균과 총점 구하기]");
		System.out.println("성적 입력하세요.");
		
		System.out.print("국어 -> ");
		korean = sc.nextInt();
		System.out.print("영어 -> ");
		english = sc.nextInt();
		System.out.print("과학 -> ");
		science = sc.nextInt();
		System.out.println("\n>>처리되었습니다.");
		sum = (korean+english+science);
		System.out.printf("\n총점 : %d\n",sum);
		
		//System.out.printf("\n평균 : %첫번째서식(%두번째서식)",첫번째수식 ,두번째수식 );
		System.out.printf("\n평균 : %d (%.2f), 과목수 : %d\n", sum/3, (double)sum/3, 3);
		//두번째 수식은 강제 casting이 필요합니다 -> 나눗셈 결과 실수가 되려면 데이터 적어도 1개가 실수형식이어야 합니다.
		
		sc.close();
	}

}
