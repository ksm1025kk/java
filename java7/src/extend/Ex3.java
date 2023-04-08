package extend;

public class Ex3 {
	public static void main(String[] args) {
		
	}
}

class Mystring{
	private String str1;
	String str2;
	protected String str3;
	public String str4;
	
	Mystring(String str){
		System.out.println("");
		this.str1 = str;
		this.str2 = str;
		this.str3 = str;
		this.str4 = str;
	}
	public void setStr() {
		this.str1 = str;
	}
	public void getStr() {
		return str1
	}
	public void setStr() {
		this.str1 = str;
	}
	public void getStr() {
		return str1
	}
}

class Mystringex extends Mystring{
	
	Mystringex(String a_str1, String a_str2){
		super(a_str1);
		// super() : 부모생성자의 메서드를 사용
		str1 = "";
		str2 = "";
		str3 = "";
		str4 = "";
		setStr(a_str2);
	}
}