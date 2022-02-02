package koreait.day2;

public class ShapeTest {

	public static void main(String[] args) {
		// [사각형 도형의 넓이 구하기] 가로 : 23 / 세로 : 19 넓이를 구했습니다. -> ....㎠
		// [원 도형의 넓이와 둘레 구하기] 지름 : 23 / 둘레를 구했습니다. -> ....㎠ / 넓이를 구했습니다. -> ....㎠
		// *참고)  원의 둘레 : 2*3.14*반지름 / 넓이 : 3.14*반지름*반지름
		//작성자 : 이우영
		//변수
		//사각형
		int width = 23; //선언하면서 초기값도 동시에 저장하는 방식
		int height = 19;
		int area = width*height;
		
		System.out.println("[사각형 도형의 넓이 구하기]");
		System.out.println("가로 : " + width + "cm");
		System.out.println("세로 : " + height + "cm");
		System.out.println("넓이 : " + area + "㎠");
				
		
		
		
		//원 : 결과 출력할 때 소수점 이하 3자리로 출력하세요.
		double radius = 23;	//int 형 데이터가 double 형으로 자동변환.
		double round = 2*3.14*radius;
		double c_area = 3.14*radius*radius;
		System.out.println("[원 도형의 넓이와 둘레 구하기]");
		System.out.printf("반지름:%.1fcm\n", radius); 		//%d는 정수데이터 서식, radius는 double 
		System.out.printf("원의 둘레:%.3f㎠\n", c_area);
		System.out.printf("원의 넓이:%.3f㎠\n", round);
		
		
	}

}
