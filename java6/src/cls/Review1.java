package cls;

public class Review1 {
	public static void main(String[] args) {
		// 다른 클래스의 변수나 메서드를 사용하려면 '객체화'를 해줘야함
		MyModel mm = new MyModel();
		MyModel mm2 = new MyModel();				// 객체가 다르면 형태와 메서드는 같지만 변수가 다름 (다른 공간)
			
		mm.setStr("안녕");				// mm.str = "안녕";
		mm2.setStr("반갑");				// mm2.str = "반갑";
		
		mm.setNum(11);
		mm2.setNum(54);
		
		MyView mv = new MyView();				// 출력용 클래스	
		mv.printStr(mm);						// 객체를 통해 값을 주고 받는다.
		mv.printStr(mm2);
		
		mv.printNum(mm);						// 객체를 통해 값을 주고 받는다. == 객체지향기법
		mv.printNum(mm2);
	}
}

class MyModel{
	// 변수들, 변수에 값을 대입학나 사용할 수 있는 메서드만
	// 클래스 = 변수 + 함수를 묶어놓은것(멤버변수, 메서드)
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
	
class MyView{
	void printNum(MyModel mm) {
		System.out.println(mm.num);
	}
	
	void printStr(MyModel mm) {
		System.out.println(mm.str);
	}
}