package string;

public class String2 {
	public static void main(String[] args) {
		Myclass9 mc = new Myclass9(); 
		
		String order1 = "name = 001 price = 002000 type = 0";
		System.out.println(mc.info(order1));
		
		String order2 = "name = 003 price = 006000 type = 1";
		System.out.println(mc.info(order2));
		
		String order3 = "name = 004 price = 006000 type = 1";
		System.out.println(mc.info(order3));
	}
}
class Myclass9{
	String p1 = "";
	int p2 = 0;
	int p3 = 0;
	String p4 = "";
	String p5 = "";
	String result = "";	
	String str;
	public void common() {
		p2 = str.indexOf("price");
		p3 = str.indexOf("type");
		p4 = str.substring(p2+8, p3-1);
			if(str.contains("type = 0")) {
				p5 = "뜨거운";
			}else if(str.contains("type = 1")) {
				p5 = "차가운";
			}
	}
		public String info(String str) {
		// name 001 = 에스프레소, 002 = 아메리카노, 003 = 카페라떼, 004 = 딸기라떼, 005 = 케모마일차
		// price 
		// type 0 : 뜨거운 1 : 차가운
		this.str = str;
		if(str.contains("001")) {
			p1 = "에스프레소";
			common();
		}else if(str.contains("002")) {
			p1 = "아메리카노";
			common();
		}else if(str.contains("003")) {
			p1 = "카페라떼";
			common();
		}else if(str.contains("004")) {
			p1 = "딸기라떼";
			common();
		}else if(str.contains("005")) {
			p1 = "케모마일차";
			common();
		}else {
			System.out.println("오류");
		}
		
		//System.out.println(p5 +" " + p1 +" " + Integer.parseInt(p4) + "원");
		result = p5 +" " + p1 +" " + Integer.parseInt(p4) + "원";
		return result;	
	}	
}
