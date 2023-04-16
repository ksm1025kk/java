package extend;

public class Ex4 {
	public static void main(String[] args) {
		S c1 = new S("본점", 123);
		c1.printMenu();
		Sb c2 = new Sb("부평점", 124);
		c2.printMenu();
	}
}
// 스타벅스 카페 
// 스타벅스_부평점			상속
// 스타벅스_강남점			상속	

class S{
	protected String 지점명;
	protected String 메뉴[] = new String[3];
	protected int 매출;
	
	public S(String 지점명, int 매출) {
		this.지점명 = 지점명;
		this.매출 = 매출;
		setMenu();
	}
	public void setMenu() {
		메뉴[0] = "카푸지노";
		메뉴[1] = "카페라떼";
		메뉴[2] = "오렌지주스";
	}
	public void printMenu() {
		System.out.print(지점명 + "의 메뉴판 : ");
		for(int i=0;i<메뉴.length;i++) {
			System.out.print(메뉴[i]+" ");
		}
		System.out.println();
	}
}

class Sb extends S{
	public Sb(String 지점명, int 매출) {
		super(지점명, 매출);
		// TODO Auto-generated constructor stub
	}
	
	public void setMenu() {
		메뉴[0] = "아메리카노";
		메뉴[1] = "카페라떼";
		메뉴[2] = "오렌지주스";
	}
	// 오버로딩 : 메서드명이 같아도 매개변수가 다르면 다른 메서드로 취급
	public void setMenu(String menu1, String menu2, String menu3) {
		메뉴[1] = menu1;
		메뉴[2] = menu2;
		메뉴[3] = menu3;
	}
}