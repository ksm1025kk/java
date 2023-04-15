package except;

import java.util.Scanner;

public class Try3 {
	public static void main(String[] args) {
		// scanner로 nextLine으로 숫자를 입력받아서 int 로 변환
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요>> ");
		int a = 0;
		
		try{
			a = Integer.parseInt(sc.nextLine());
		}catch(Exception e) {
			System.out.println("오류(0 표시)");
		}
		System.out.println(a);
		System.out.println("프로그램 종료");
		
		
	}
}
