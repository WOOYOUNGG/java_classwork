package koreait.day11;

public class ShapeTest {

	public static void main(String[] args) {
		
		Triangle tri1 = new Triangle("삼각형1", 23, 45);
		
		tri1.print();		//1)자식이 만든 메소드
		System.out.println("넓이:"+tri1.getArea());	//2)부모가 물려준 메소드 - 오버라이드 함.(공식이 다릅니다.)
		System.out.println("넓이:"+tri1.getAreaDouble());	//2)자식이 만든 메소드.
		System.out.println("특별한 변수 테스트 -(Shape Test에서 출력)--------------");
		System.out.println("기타정보:"+tri1.etc);
		System.out.println("count:"+tri1.count);
		
		
	}

}
