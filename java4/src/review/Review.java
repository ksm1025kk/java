package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		// 시험합격점수는 국어 영어 수학이 각각 40점 이상이고 총 점수가 150점 이상이면 합격
		// 40점 이하의 점수가 있으면 과락, 각 과목이 40점 이상이나 총점이 미달되었으면 총점미달
		int 국어 = 0, 수학 = 0, 영어 = 0, 총점 = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			System.out.print("국어점수를 입력하세요.==> ");
			국어 = sc.nextInt();
			System.out.print("수학점수를 입력하세요.==> ");
			수학 = sc.nextInt();
			System.out.print("영어점수를 입력하세요.==> ");
			영어 = sc.nextInt();
			총점 = 국어 + 수학 + 영어;
			
			if(국어 >= 40 && 수학 >= 40 && 영어 >= 40) {
				if(총점 >= 150) {
					System.out.println("합격");
				}
				else {
					System.out.println("총점미달");
				}	
			}
			else {
				System.out.println("과락");
			}	
		}
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		for(int i = 0; i < 10; i++) {
			if(i==9) {
				System.out.println((10-i));
			}
			else{
				System.out.print((10-i) + "/");
			}
		}
		for(int i = 10; i >= 1 ; i--) {
				System.out.print(i + " ");
		}
	}
}

