package koreait.day17;

import java.util.Comparator;

public class MemberNameDescending implements Comparator<Member>{
//Member 클래스의 비교기준을 설정합니다. 이름 또는 나이를 결정합니다.

	
	
	@Override
	public int compare(Member o1, Member o2) {
		return o1.getName().compareTo(o2.getName());			//compareTo는 비교메소드 : 래퍼클래스의 메소드
		
		//a>b : 음수, a==b : 0, a<b : 양수
		
		
		
	}
	
	
	
}
