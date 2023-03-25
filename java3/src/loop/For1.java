package loop;

public class For1 {
	public static void main(String[] args) {
		// 반복문 : while, for
		// for : while이 너무 가독성이 떨어져서 
		
		// 0 ~ 9까지 출력 while
		int i = 0;
		while(i < 10) {
			if(i==9) {
				System.out.println(i);
			}
			else {
			System.out.print(i+", ");
			}
			i++;
		}
		
		// while 단점 : 플래그를 바깥에 만들어줘야함, {}안에서 플래그를 증감, 결론으로 가독성이 떨어짐
		// for문 : 플래그 관련 코드는 ()에 몰아서 사용 반복할 코드만 {]에 남김
		// for(초기값;조건식;증감량;){반복할 코드;}
		
		for(int j = 0; j < 10; j++) {
			System.out.println("for: "+j);
		}
		
		// for문의 장점 : while에 비해 가독성이 좋고 개발이 편리
		// for문의 단점 : while만큼 자유롭지 않음
	}
	
}
