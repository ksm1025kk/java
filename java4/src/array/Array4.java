package array;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		// 국가와 수도 (5개)
		
		String countries[] = {"대한민국", "일본", "중국", "미국", "러시아"};
		String cities[] = {"서울", "도쿄", "베이징", "워싱턴 DC", "모스크바"};
		
		System.out.println("[ 국가별 수도 ]");
		for(int i = 0; i < countries.length; i++) {
			System.out.println(countries[i] + "의 수도는 " + cities[i] + "입니다.");
		}
		
		// 사용자 입력으로 국가를 받아서 해당 국가의 수도를 알려주는 프로그램
		// 수도를 알고자 하는 국가의 이름을 입력하세요.
		// 대한민국 ==> 서울
		// 일본 == 도쿄
		String country;
		Scanner sc = new Scanner(System.in);
		System.out.println("수도를 알고자하는 국가의 이름을 입력하세요.==> ");
		country = sc.next();
		int index = -1;
		for(int i = 0; i < countries.length; i++) {
			if(country.equals(countries[i])) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("해당국가가 없습니다.");
		}
		else {
			System.out.println(countries[index] + "의 수도는 " + cities[index] + "입니다.");	
		}
	}
}

