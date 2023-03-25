package loop;

public class While2 {
	public static void main(String[] args) {
		// 반복문 : 유사한 코드를 자동 수행하기 위해
		// while은 설계가 필요     
		// ex)  10000번만 수행할 수 있도록
		// while을 사용하려면 플래그 변수가 필요, 조건식 세우기, while안에서 플래그 값을 증감
//		int i = 0;
//		while(i < 10000) {
//			System.out.println("안녕");
//			i++;			// 누적연산 +=1
//		}
		
		// while문을 사용하여 반갑습니다 15번 출력
		int j = 0;
		while(j < 15) {
			System.out.println(j+1);
			System.out.println("반갑습니다.");
			j++;
		}
	}
}
