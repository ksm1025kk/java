package collection_;

import java.util.ArrayList;
import java.util.Scanner;

public class List2 {
	public static void main(String[] args) {
		ArrayList2 arr = new ArrayList2();
		Scanner sc = new Scanner(System.in);
		arr.setMenuPrice();
		System.out.println("== 항목을 선택하세요==");
		int choice = sc.nextInt();
		String str = "";
		while(true) {
			System.out.println("1.추가 2.변경 3.삭제 4.전체보기 0.나가기");
			switch(choice) {
			case 0:
				System.out.println("종료");
				break;
		
			case 1:
				System.out.println("추가할 메뉴를 입력하세요");
				str = sc.next();
				arr.addMenuPrice(str);
				arr.printMenu();
				break;
			case 2:
				System.out.println("수정할 메뉴를 입력하세요");
				str = sc.next();
				arr.modifyMenuPrice(str);
				break;
			
				//case 3:
				//System.out.println("제거할 메뉴를 입력하세요");
				//str = sc.next();
				//arr.removeMenuPrice(str);
				//break;
			case 4:
				System.out.println("전체보기");
				arr.printMenu();
				break;	
			}
		}
	}
}

class ArrayList2{
	// 라면 김밥 떡볶이 순대
	// 1000, 2000, 3000, 4000
	
	// ArrayList 2개를 통해서 진행
	ArrayList<String>menu = new ArrayList<>();
	ArrayList<Integer>price = new ArrayList<>();
	
	public void setMenuPrice() {
		// 라면  김밥   떡볶이 순대
		// 1000 2000 3000 4000
		
		menu.add("라면");
		menu.add("김밥");
		menu.add("떡볶이");
		menu.add("순대");
		
		price.add(1000);
		price.add(2000);
		price.add(3000);
		price.add(4000);
	}
	public void printMenu() {
		// 모든메뉴출력
		// 라면 : 1000
		// 김밥 : 2000
		// 떡볶이 : 300;
		// 순대 : 4000
		for(int i = 0; i < menu.size(); i++) {
			System.out.println(menu.get(i) + "=" + price.get(i) + "원");
			
		}	
	}
	public void addMenuPrice(String str) {
		menu.add(str);
		price.add(1000);
	}
	public void modifyMenuPrice(String str) {
		int de = menu.indexOf(str);
		menu.set(de, str);
		price.set(de, 1000);
	}
}