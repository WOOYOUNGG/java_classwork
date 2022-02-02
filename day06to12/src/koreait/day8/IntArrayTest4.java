package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest4 {
//intArrayTest 첫 번째 예제는 day7 프로젝트에 있습니다.	
//int 값 저장하는 배열을 활용하는 연습입니다.(1)
	public static void main(String[] args) {
		
		//배열의 크기는 20 -> 메모리 할당
		int[] scores = new int[20];
		
		//배열의 값은 난수 1~99 범위값 저장
		Random r1 = new Random(System.currentTimeMillis());	//난수 발생에 필요한 seed 값 설정
		
		for(int i=0;i<scores.length;i++) {
			scores[i] = r1.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(scores));	//배열값 출력합니다.
		//**)값의 분포 개수를 90~100, 80~89, 70~79, 60~69, 50~59, 40~49, 40 미만 범위로 출력합니다.
		//카운트 변수 4개 초기화 -> 분포가 더 다양하다면? 변수가 더 많이 필요합니다. -> cnt 변수값도 배열 사용합니다.
		int[] cnts = new int[7];
		//위 분포 순서대로 인덱스를 사용합니다.
		
	for(int i=0;i<scores.length;i++) {
		int temp = scores[i];
		if(temp>=90) cnts[0]++;
		else if(temp>=80) cnts[1]++;
		else if(temp>=70) cnts[2]++;
		else if(temp>=60) cnts[3]++;
		else if(temp>=50) cnts[4]++;
		else if(temp>=40) cnts[5]++;
		else cnts[6]++;
	}
		//결과 출력: 연습 - 출력을 반복문으로 수정해보기(90, 100, 80, 89 출력되는 숫자를 수식으로 가능?)
		System.out.println("점수 분포 요약--------------");
		System.out.println("90~100 값의 갯수 : " + cnts[0]);
		System.out.println("80~89 값의 갯수 : " + cnts[1]);
		System.out.println("70~79 값의 갯수 : " + cnts[2]);
		System.out.println("60~69 값의 갯수 : " + cnts[3]);
		System.out.println("50~59 값의 갯수 : " + cnts[4]);
		System.out.println("40~49 값의 갯수 : " + cnts[5]);
		System.out.println("40미만 값의 갯수 : " + cnts[6]);
		
	}


}