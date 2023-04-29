package collection_;

import java.util.ArrayList;
import java.util.Scanner;

public class Nations {
	public static void main(String[] args) {
		// 추가, 변경, 전체보기, 끝내기
		// 항목이 있는 프로그램
		// 세계국가이름
		ArrayList4 L4 = new ArrayList4();
		Scanner sc = new Scanner(System.in);
		System.out.println("== 항목선택==");
		String str = "";
		String after = "";
		int choice = 0;
		
		while(true) {
			System.out.println("1.추가 2.변경 3.삭제 4.보기 0 끝내기");
			choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("추가할 국가명 입력");
				str = sc.next();
				L4.addnations(str);
			}
			else if(choice == 2) {
				System.out.println("변경할 국가 입력");
				str = sc.next();
				System.out.println("변경할 국가 입력");
				after = sc.next();
				L4.modifynations(str, after);
			}
			else if(choice == 3) {
				System.out.println("제거할 국가 입력");
				str = sc.next();
				L4.deletenations(str);
			}
			else if(choice == 0) {
				System.out.println("끝내기");
				break;
			}
			else if(choice == 4){
				L4.shownations();
			}
			else {
				System.out.println("잘못입력, 전체보기실행");
				L4.shownations();
			}
		}
	}
}
class ArrayList4{
	private ArrayList<String>nations = new ArrayList<>();
	
	// 생성자로 기본국가 4개
	public ArrayList4() {
		nations.add("대한민국");
		nations.add("미국");
		nations.add("중국");
		nations.add("일본");
	}
	// 추가
	public void addnations(String str) {
		nations.add(str);
	}
	// 수정
	public void modifynations(String str, String after) {
		int num = nations.indexOf(str);
		nations.set(num, after);
	}
	// 삭제
	public void deletenations(String str) {
		int num = nations.indexOf(str);
		nations.remove(num);
	}
	public void shownations() {
		for(int i = 0; i<nations.size(); i++) {
			System.out.println(nations.get(i));
		}
	}
}