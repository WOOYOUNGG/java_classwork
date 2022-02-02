package koreait.day1;	//koreait.day1은 패키지 이름

public class PrintTest2 {	//PrintTest는 클래스 이름. 시작은 반드시 대문자로.

	public static void main(String[] args) {
		//day2: 출력 메소드 종류
		System.out.print("Hi! Java~~ 안녕하니 자바야!");		//print는 줄바꿈 없음.
		//syso 입력후 ctrl + 스페이스바로 자동완성.
		System.out.print("-------------\t----------\n");		// \n은 줄바꿈 문자, \t는 탭(tab)문자
		System.out.printf("%s\n","End!");
		System.out.printf("%-10s\n","End!");		//printf : format 적용(%기호 사용, s는 문자열)
		System.out.printf("%-10s %5s\n","End!", "End!");	//printf : format 적용
		
		//데이터 형식: 문자열(문장), "" 기호 안에 작성. string
	}

}
//1.클래스 : 대문자로 시작한다. 특정기능을 갖고 있다 -> 메소드로 제공한다 예)System, String....
//2.메소드 : 소문자로 시작한다. ()기호가 바로 뒤에 나온다. ()안에는 실행에 필요한 추가적인 데이터가 작성되기도 한다. 예)println
//			형식은 클래스.메소드() 와 같습니다. System.out.println 은 특별한 경우. 문법적인 설명은 이후 진도에서.
//3.System.out.println 은 특별한 경우. 문법적인 설명은 이후 진도에서 자세히 설명. println 메소드는 out(출력)에 속해 있다.
//		(out은 println의 아버지 System은 할아버지인 꼴.)
