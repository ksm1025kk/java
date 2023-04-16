package loop;

import java.util.Scanner;

public class While3 {
	public static void main(String[] args) {
		// while문의 플래그를 활용하여
		// 1 ~ 10의 합계을 구하시오
		int i = 0;
		int sum = 0;
		
		while(i < 10) {
			sum += i + 1;
			i++;
		}	
		System.out.println(sum);
		
		// 사용자에게 정수값을 입력받아서 1 ~ 입력값까지의 모두 합한 결과를 출력
		// 예를 들어 50을 입력받으면 1 ~ 50까지 각각 다 더해서 1275 출력		
		int j = 0;
		int k = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("1 보다 큰 정수를 입력하세요==> ");
		k = sc.nextInt();
		System.out.println("1 부터 " + k + " 까지의 합");
		while(j < k) { 
			num += j + 1;
			j++;
		}
		System.out.println(num);
	}
}
 