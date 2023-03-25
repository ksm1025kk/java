package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		// 사용자에게 정수를 입력받고
		// 천의 자리로 ,를 넣어주세요
		
		/*
		 100   ==> 100
		 1000  ==> 1,000
		 10000 ==> 10,000 
		*/
		
		int num = 0;
		int 천 = 0;
		int 천나머지 = 0;
		String str_n = null;
	
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 ==> ");
		num = sc.nextInt();
		System.out.println("입력한 값은 " +num+ "입니다.");
		if(num < 1000) {
			System.out.println(num);
		}
		else if(num <= 9999 ) {
			천 = num / 1000;
			System.out.println(천);
			천나머지 = num % 1000;
			if(천나머지<10) {
				str_n = "00" + 천나머지;
			}
			else if(천나머지<100) {
				str_n = "0" + 천나머지;
			}
			else if(천나머지<1000) {
				str_n = ""+ 천나머지;
			}
			System.out.println(str_n);
			System.out.println(천+","+str_n);
		}
	}
}
