package koreait.day16_interface;

public class InterfaceTest {

	public static void main(String[] args) {
		//기본적인 방식
		MyClassA my1 = new MyClassA();
		MyClassAB my2 = new MyClassAB();
		
		//1.인터페이스는 객체 생성 못함.
		//2.인터페이스 타입으로 객체를 참조합니다.
		//
		
		InterfaceA ia1 = new MyClassA();
		InterfaceA ia2 = new MyClassAB();
		
		
		InterfaceB ib1 = new MyClassAB();
		InterfaceB ib2 = new MyClassC();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
