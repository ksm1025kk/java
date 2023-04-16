package extend;

public class Ex5 {
	public static void main(String[] args) {
		MyStr m1 = new MyStr("str");
		m1.printStr();
		MyStrdeco m2 = new MyStrdeco("str");
		m2.printStr();
	}
}

class MyStr{
	protected String str;

	public MyStr(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public void printStr() {
		System.out.println(str);
	}
}

// Mystr 클래스를 상속받고 출력이 좀 더 꾸며진 채로 출력될 수 있게 변경
class MyStrdeco extends MyStr{

	public MyStrdeco(String str) {
		super(str);			// 부모 생성자에 매개변수가 있으면(기본 생성자가 없으면) 자식 생성자에서 사용해줘야함
	}
	public void printStr() {
		System.out.println("==" + str + "==");
	}
}