package loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		// for문을 통해서 구현
		// 1. 안녕 5번
		// 2. 1 ~ 10까지의 합계
		// 3. 1 ~ 입력값까지의 합계구하기(1 ~ 50의 합 1275)
		
		for(int i = 0; i < 5; i++) {
			if(i==4) {
				System.out.println("안녕");
			}
			else {
				System.out.print("안녕/");
			}
		}
		
		int sum = 0;
		for(int i = 0; i<10; i++) {
			sum += i + 1;
		}
		System.out.println(sum);
		
		int num = 0;
		int k = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("1 보다 큰 정수를 입력하세요.==> ");
		k = sc.nextInt();
		System.out.println("1 부터 " + k + " 까지의 합");
		for(int i = 0; i < k; i++) {
			num += i + 1;
		}
		System.out.println(num);
	}
}
