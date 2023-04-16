package inter;

public class Review4 implements Review3 {

	@Override
	public void test1() {
		System.out.println(str);
	}

	@Override
	public void test2() {
		System.out.println("재정의");
	}
	// 인터페이스를 받으면 클래스 명에 빨간밑줄 생성됨
	
	public static void main(String[] args) {
		System.out.println(str2);				// static은 바로 쓸 수 있음
		Review4 r4 = new Review4();
		r4.test1();
		r4.test2();
	}
}

// extends 상속 : 한 클래스에 하나만 가능
// implements  : 여러개 가능