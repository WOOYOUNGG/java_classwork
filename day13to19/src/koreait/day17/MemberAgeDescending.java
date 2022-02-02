package koreait.day17;

import java.util.Comparator;

public class MemberAgeDescending implements Comparator<Member>{
//Member 클래스의 비교기준을 설정합니다. 이름 또는 나이를 결정합니다.

	
	
	@Override
	public int compare(Member o1, Member o2) {
		Integer a = o1.getAge();		//int를 Integer타입으로 참조
		Integer b = o2.getAge();		
		return b.compareTo(a);			//compareTo는 비교메소드 : 래퍼클래스의 메소드 a에서 b를 뺌
		
		//a>b : 음수, a==b : 0, a<b : 양수
		
		
		
	}
	//결론 : 
	//list에 저장된 데이터를 정렬하는 것은 sort 메소드가 합니다. sort(정렬) 알고리즘 : 비교와 교환입니다.
	//기본형타입 데이터와 String은 이미 비교기준이 있습니다.
	//다른 타입 객체들은 비교 기준만 알려주면 됩니다. -> Comparator 인터페이스의 copareTo메소드 입니다.
	// -> sort메소드의 인자로 전달합니다.
	
}
