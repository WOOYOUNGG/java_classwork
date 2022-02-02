package koreait.day10;

public class MyClass2 {
	//접근 권한 연습합니다.
		private int age;		//private : 다른 클래스에서 사용 못합니다. 나만(현재 클래스) 사용한다.
		String name;			//default(package) : 다른 패키지에서 사용 못합니다. 이웃(패키지)이면 같이쓰자.
		public int score;		//public : 어디서나 사용합니다. 공공의,공용의.. 다같이 쓰자
		
		//생성자 메소드:public, default에 따라 접근권한 설정할 수 있다.
		//(자동으로 숨어있는)기본생성자메소드 접근권한 public
/*
		MyClass2() {
			//이렇게 수정(Myclass2() 앞에 있던 public을 지우면 )하면 다른 패키지에서 객체 생성을 못합니다.
		}
		
*/
}