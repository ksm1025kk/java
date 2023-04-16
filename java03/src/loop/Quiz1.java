package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 비밀번호 맞추기(기회는 다섯번, 정수)
		// 1 ~ 10 중 짝수만 출력하기
		Scanner sc = new Scanner(System.in);
		int password = 0;
		for(int i = 0; i < 5; i++) {
			System.out.print("비밀번호는 입력하세요==> ");
			password = sc.nextInt();
			if(password == 1234) {
				System.out.println("비밀번호가 맞습니다.");
				break;
			}
			else {
				System.out.println("비밀번호가 틀립니다.(남은 기회는 "+(5-(i+1))+"번)");
			}
		}
		
		System.out.println("");
		
		for(int i = 1; i<11; i++) {
			if(i % 2==1) {
				continue;
			}
			if(i==10) {
				System.out.print(i);
			}
			else {
				System.out.print(i + "/");
			}
		}
	}
}

