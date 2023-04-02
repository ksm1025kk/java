package cls;

public class KrController {
	public static void main(String[] args) {
		KrModel kr1 = new KrModel();
		KrModel kr2 = new KrModel();
		KrView kv = new KrView();
		
		kr1.setStr("안녕");
		kr1.setNum(11);
		kr2.setStr("반갑");
		kr2.setNum(12);
		
		kv.printStr(kr1);
		kv.printStr(kr2);
		
		KrService km = new KrService();				// 꾸며주기 클래스
		
		km.decoEqual(kr1);
		km.decoPlus(kr2);
		
		kv.printStr(kr1);
		kv.printStr(kr2);
		kv.printNum(kr1);
		kv.printNum(kr2);
	}
}
class KrModel{						// 변수 : num, str / 메서드 : get, set
	
	int num;
	String str;
	
	public void setStr(String str) { 
		this.str = str;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getStr() {	
		return str;
	}
	
	public int getNum() {
		return num;
	}
}
class KrView{						// 출력용 클래스
	void printNum(KrModel kr) {
		System.out.println(kr.getNum());
	}
	
	void printStr(KrModel kr) {
		System.out.println(kr.getStr());
	}
}
class KrService{
	void decoEqual(KrModel kr) {
		kr.setStr("==" + kr.getStr() + "==");
	}
	void decoPlus(KrModel kr) {
		//kr1.setStr("+" + kr1.getStr() + "+");
		kr.str = "+" + kr.str + "+";
	}
}