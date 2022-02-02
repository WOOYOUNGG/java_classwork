package koreait.day15;

public class MyFileRWTest {

	public static void main(String[] args) {
		
		MyFileRW.fileRead("C:\\dev\\자바테스트.txt");
		MyFileRW.fileRead("C:\\dev\\directx.log");
		
		String[] menu = {"삼겹살","스파게티","곱창전골","불고기","탕수육"};
		Member[] members = {new Member("모모", 17), new Member("사나",21),null,null,null};
		//System.out.println(members.length);
		members[2] = new Member("쯔위", 22);
		members[3] = new Member("나연", 29);
		members[4] = new Member("다현", 18);
		
		//위 2개 배열을 C:\\dev\\자바테스트.txt 파일에 쓰기 해보세요.
		String filename = "C:\\dev\\members.txt";
		MyFileRW.fileWrite(filename, menu);
		MyFileRW.fileWrite(filename, members);	//같은파일 떄는 덮어쓰기
	}

}
