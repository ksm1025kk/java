package operator;

public class Oper1 {
	public static void main(String[] args) {
		
		// 파일명바꾸기 F2
		
		// 프로그래밍은 기본적으로 위에서 아래로, 왼쪽에서 오른쪽으로 진행합니다.
		int 숫자1 = 3;
		int 숫자2 = 2;
		System.out.println(숫자1 - 숫자2 * 숫자2);
		System.out.println((숫자1 - 숫자2) * 숫자2);
		System.out.println(8/4/2);
		System.out.println(8/(4/2));
		
		System.out.println(3/2);			// 1.5(X) 1(O)
		System.out.println(3/2.0);			// 소수점있는 숫자로 계산해야 소수점있는 숫자로 나옴
	}
}
