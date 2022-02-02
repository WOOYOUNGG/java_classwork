package koreait.day10b;

import java.util.Scanner;

public class NumberGameStart {
//NumberGame 실행 - 게임 기록 저장
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		NumberGame[] result = new NumberGame[5];		//게임기록 저장 최대 5번.
		int k=0;	//result 
		
		System.out.println("숫자 맞추기 게임입니다.");
		System.out.println("게임을 시작하려면 너(휴먼)의 이름을 쓰시오.");
		String gamer = sc.nextLine();
		
		do {
			NumberGame ng = new NumberGame(gamer);
			int[] numbers = new int[10];
			
			System.out.println("이제 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.");
			int random = NumberGame.makeNumber(101, 200);
			
			System.out.println("너 휴먼 맞춰보세요.(101~200)");
			int i = 0;		//numbers 배열(사용자 입력숫자 저장)의 인덱스

			do {
				System.out.print("생각한 숫자 입력 (기회 : " + (10 - i) + ") -> ");
				numbers[i] = sc.nextInt();
				
				if (random > numbers[i]) {
					System.out.println("아닙니다. 더 큰 값입니다.");
				} else if (random < numbers[i]) {
					System.out.println("아닙니다. 더 작은 값입니다.");
				}else {		//random==numbers[i]일 때 -> 정답일 때
					ng.setSuccess(true);
					
				}
				i++;

				if (i == 10) 	break;
				
			} while (!ng.isSuccess());
			
			//위의 반복을 어떻게 종료한 것이냐?
			ng.setCount(i);
			if(ng.isSuccess()) {
				System.out.println("딩동댕~ 맞추셨습니다. 지금까지 시도한 숫자");
				for(int j=0;j<1;j++) {
					System.out.println(numbers[j]);
					System.out.print((j!=(i-1)?",":" "));
									//ㄴ조건이 참이면 ,출력 거짓이면 공백 출력
				}
				
				System.out.println(".."+ng.getCount()+"만에 정답입니다");
			}else {
				System.out.println("탈락. 모든 기회를 다 사용했습니다.");
				System.out.println("정답은"+random+"입니다.");
			}
			result[k]=ng;
			k++;		//게임 기록 저장 result 배열 인덱스 증가
			if(k==5) break;
			System.out.print("게임을 계속 하시겠습니까? 계속하시려면 0 입력하세요. ->");
		}while(sc.nextInt()==0);
		//게임기록 	result 배열 값 출력.
		System.out.println(":::게임스코어:::");
		for(int j=0;j<k;j++)
			result[j].print();
		
		System.out.println("::::::Game End:::::::");
	}

}
