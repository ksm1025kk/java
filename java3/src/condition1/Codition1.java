package condition1;

import java.util.Scanner;

public class Codition1 {
	public static void main(String[] args) {
		// 체어문 : if, switch, while, for, break, continue
		// 조건문 : if, switch
		// if가 기본 조건문, switch는 같은 경우만 비교
		
		int num = 0;
		if(num == 0) {
			System.out.println("num은 0이다");
		}
		else if(num == 1) {
			System.out.println("num은 1이다");
		}
		else if(num == 2) {
			System.out.println("num은 2이다");				// 같은 것을 찾는 조건문은 switch 로 변경할 수 있다.(가독성이 떨어짐)
		}
		else {
			System.out.println("그 밖에");
		}
		
		// switch(){case ~ break ~ default ~ break}
		switch(num) {
		case 0:
			System.out.println("0이다.");
			break;
		case 1:
			System.out.println("1이다.");
			break;
		case 2:
			System.out.println("2이다.");
			break;
		default:
			System.out.println("그 밖에");
			break;
		}
		
		// 사용자 입력을 받아 (1:안녕하세요. / 2:반갑습니다. / 3: 잘있어요. / 4:다시만나요. / 그 외 : 잘못입력하셨습니다.
		
		int number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 4 사이의 정수를 입력하세요.==> ");
		number = sc.nextInt();
		System.out.println("입력한 값은 " + number + "입니다.");
		switch(number) {
		case 1:
			System.out.println("안녕하세요.");
			break;
		case 2:
			System.out.println("반갑습니다.");
			break;
		case 3:
			System.out.println("잘있어요.");
			break;
		case 4:
			System.out.println("다시만나요.");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
	}
}
