package extend;

public class Ex1 {
	public static void main(String[] args) {
		Human 홍씨 = new Human("홍길동", 16);
		홍씨.말하기();
		홍씨.밥먹기();
		Humandeco 박씨 = new Humandeco("박첨지", 18);
		박씨.말하기();
		박씨.밥먹기();
		Humanex 이씨 = new Humanex("이이", 22);
		
		// 이때, 원본에 버그가 발생해서 수정해야하면
		// 1번 수정작업 필요 ==> 3번 수정작업 필요
		// 실수를 할 확률이 높아짐
		
		// ==> 문제발생원인 "복사 붙여넣기를 했기 때문"
		// ==> "사람"이 복사 붙여넣기를 했기 때문에
		// 결론 = "컴퓨터"가 복사 붙여넣기 하게하자(상속)        
	}
}

class Human{
	private String name;
	private int age;
	
	Human(String name, int age){
		System.out.println("생성");
		this.name = name;
		this.age = age;
	}
	public void 말하기() {
		System.out.println("==" + name + "(이)가 말합니다.");
	}
	public void 걷기() {
		System.out.println("==" + name + "(이)가 걷습니다.");
	}
	public void 밥먹기() {
		System.out.println("==" + name + "(이)가 밥을 먹습니다.");
	}
}

class Humandeco{
	private String name;
	private int age;
	
	Humandeco(String name, int age){
		System.out.println("생성");
		this.name = name;
		this.age = age;
	}
	public void 말하기() {
		System.out.println("++" + name + "(이)가 말합니다.");
	}
	public void 걷기() {
		System.out.println("++" + name + "(이)가 걷습니다.");
	}
	public void 밥먹기() {
		System.out.println("++" + name + "(이)가 밥을 먹습니다.");
	}
}

class Humanex{
	private String name;
	private int age;
	
	Humanex(String name, int age){
		System.out.println("생성");
		this.name = name;
		this.age = age;
	}
	public void 말하기() {
		System.out.println(name + "(이)가 말합니다.");
	}
	public void 걷기() {
		System.out.println(name + "(이)가 걷습니다.");
	}
	public void 밥먹기() {
		System.out.println(name + "(이)가 밥을 먹습니다.");
	}
}


