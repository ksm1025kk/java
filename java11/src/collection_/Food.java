package collection_;

import java.util.ArrayList;
import java.util.Scanner;

public class Food {
	public static void main(String[] args) {
		// 1.추가 2.수정 3.삭제 4.보기 0.끝내기 
		// 음식점 항목을 관리하는 프로그램 만들기
		// 기본메뉴 : 김밥 떡볶이 순대
		// 가격 : 1000, 2000, 3000
		FoodList fl = new FoodList();
		Scanner sc = new Scanner(System.in);
		System.out.println("== 항목선택==");
		String str = "";
		String after = "";
		int money = 0;
		int choice1 = -1;
		while(true) {
			System.out.println("1.추가 2.변경 3.삭제 4.보기 0 끝내기");
			choice1 = sc.nextInt();
			if(choice1 == 1) {
				System.out.println("추가할 음식 입력");
				str = sc.next();
				try{
					System.out.println("추가할 음식 가격입력");
					money = sc.nextInt();
					fl.addFood(str, money);
				}catch(Exception e) {
					// TODO: handle exception
					System.out.println("오류");
					continue;
					
				}
			}
			else if(choice1 == 2) {
				System.out.println("변경할 음식 입력");
				str = sc.next();
				System.out.println("변경할 음식 입력");
				after = sc.next();
				
				System.out.println("변경할 음식 가격입력");
				money = sc.nextInt();
				fl.modifyFood(str, after, money);
			}
			else if(choice1 == 3) {
				System.out.println("제거할 음식 입력");
				str = sc.next();
				fl.deleteFood(str);
			}
			else if(choice1 == 0) {
				System.out.println("끝내기");
				break;
			}
			else if(choice1 == 4){
				fl.showFood();
			}
			else {
				System.out.println("잘못입력, 전체보기실행");
				fl.showFood();
			}
		}
	}
}
class FoodList{
	ArrayList<String> name = new ArrayList<>();
	ArrayList<Integer> price = new ArrayList<>();
	
	public FoodList() {
		name.add("김밥");
		name.add("떡볶이");
		name.add("순대");
	
		price.add(1000);
		price.add(2000);
		price.add(3000);
	}
	public void addFood(String str, int money ){
		name.add(str);
		price.add(money);
	}
	public void modifyFood(String str, String after, int money ){
		int num = name.indexOf(str);
		name.set(num, after);
		price.set(num, money);
	}
	public void deleteFood(String str){
		int num = name.indexOf(str);
		name.remove(num);
		price.remove(num);
	}
	public void showFood(){
		for(int i = 0; i<name.size(); i++) {
			System.out.println(name.get(i) + " = " + price.get(i));
		}
	}
}
