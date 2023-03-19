package condition;

import java.util.Scanner;

public class Ifelse3 {
	public static void main(String[] args) {
		// 변수 = sc.nextInt
		// 1. 20세 이상이면 성인, 14세 ~ 19세는 청소년, 14세 미만은 어린이로 구분
		
		Scanner sc = new Scanner(System.in);
		int 나이 = 0;
		System.out.print("나이를 입력하세요==> ");
		나이 = sc.nextInt();
		System.out.println("입력된 나이는 " + 나이 + "입니다.");
		if(나이 >= 20) {
			System.out.println("성인");
		}else if(나이 >= 14) {
			System.out.println("청소년");
		}else {
			System.out.println("어린이");
		}
		
		// 2. 학점계산(90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 그 미만은 F)
		
		int 학점 = 0;
		System.out.print("학점을 입력하세요==> ");
		학점 = sc.nextInt();
		System.out.println("입력된 학점은 " + 학점 + "점 입니다.");
		if(학점 >= 90) {
			System.out.println("A");
		}else if(학점 >= 80) {
			System.out.println("B");
		}else if(학점 >= 70) {
			System.out.println("C");
		}else{
			System.out.println("F");
		}
		
		// 3. 비밀번호를 정해놓고 사용자가 비밀번호를 입력하여 맞추면 "비밀번호가 맞습니다. 틀리면 비밀번호가 다릅니다
		
		int 비번 = 0;
		System.out.print("비밀번호를 입력하세요==> ");
		비번 = sc.nextInt();
		System.out.println("입력된 비밀번호는 "+비번);
		if(비번 == 1234) {
			System.out.println("비밀번호가 맞습니다.");
		}else {
			System.out.println("비밀번호가 틀립니다.");
		}
		
		// 윤년 판별하기
		
		int 윤년 = 0;
		System.out.print("연도를 입력하게요==> ");
		윤년 = sc.nextInt();
		System.out.println("입력된 연도는 "+윤년+"년 입니다.");
		if((윤년 % 4 == 0 && 윤년 % 100 != 0)||윤년 % 400 == 0) {
			System.out.println("해당 연도는 윤년입니다.");
		}
		else {
			System.out.println("해당 연도는 윤년이 아닙니다.");
		}
		sc.close();
	}
}
