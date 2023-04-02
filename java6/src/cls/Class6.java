package cls;

public class Class6 {
	public static void main(String[] args) {
		Car 아빠차 = new Car();
		// 아빠차.name = "그렌저";					// private하면 직접 사용이 불가능해짐 (대입도 x)
		// System.out.println(아빠차.name);	// 사용x
		
		아빠차.setName("그렌저");
		System.out.println(아빠차.getName());
	}
}

// 멤버변수는 private, 메서드는 public

/*
 접근권한 제어자
 private : 다른 클래스에서 접근 불가능
 아무것도 안적으면 default 값 : 다른 패키지에서 접근 불가능
 protected : 다른 패키지에서 접근 불가능하지만 상속했을 경우에는 가능
 public : 접근가능 (같은 프로젝트)
 */

// 캡슐화 : 멤버변수를 private로 만들어서 외부 클래스로부터 데이터를 보호하고 public 메서드로 제공한다
class Car{
	// 차명, 색상, 차번호(뒷자리)
	private String name;
	private String color;
	private int number;
	
	// 대입을 위해서는 set
	public void setName(String name) {		// public 메서드로 제공되지 않는 private 변수는 대입이나 사용이 불가능
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setNum(int number) {
		this.number = number;
	}
	
	// 사용을 위해선  get
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getNumber() {
		return number;
	}
}