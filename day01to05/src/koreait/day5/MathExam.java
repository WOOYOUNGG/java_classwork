package koreait.day5;

import java.util.Scanner;

public class MathExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sel =0;
		char op=' ';
		System.out.println("[[수학 공부 도우미]]");
		System.out.println("1.덧셈\t2.뺄셈\t3.곱셈\t4.종료\n");
		
		while(true) {
			int n1,n2,result = 0;
			System.out.print("연산을 선택하세요. -> ");
			sel = sc.nextInt();
			
			if(sel==4) {
				System.out.println("프로그램을 종료합니다.Bye,,👍👍");
				break;
			}else if(sel<1||sel>3) {
				System.out.println("✔잘못된 연산값입니다.다시 선택하세요.");
				continue;
			}
			System.out.print("✏  값 1 을 입력하세요. -> ");
			n1=sc.nextInt();
			System.out.print("✏  값 2 을 입력하세요. -> ");
			n2=sc.nextInt();
			if(sel==1) {
				op='+'; result=n1+n2; 
			}
			if(sel==2) {
				op='-'; result=n1-n2; 
			}
			if(sel==3) {
				op='*'; result=n1*n2; 
			}
			
			System.out.print("정답  : "+n1 +op+n2+"=" + result +" 입니다.\n\n");

	}

}
}