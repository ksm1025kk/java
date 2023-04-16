package cls;

public class Method2 {
	public static void main(String[] args) {
		// 객체화
		MyClass5 mc5 = new MyClass5();
		mc5.메서드1();
		mc5.메서드2("안녕하세요.", "반갑습니다.");
		mc5.메서드2("잘있어요.", "다시만나요.");
		// 반환값이 있으면 변수로 담는 형태를 사용한다
		// 메서드3이 String으로 반환해주기 때문에 
		String result3 = mc5.메서드3();
		result3 = mc5.메서드3();
		System.out.println(result3);
		// 입력값O, 반환값O
		// ()안을 채워줘햐하고, 반환값을 받을 변수를 만들어야한다.
		// 메서드4는 int 형태로 반환하고, 입력값은 실수1개
		int result4 = mc5.메서드4(3.7);
		System.out.println(result4);
	}
}

class MyClass5{
	// 메서드1 : 반환값x, 입력값x(코드 저장목적, 가독성)
	void 메서드1() {
		// 입력값이 없으면 ()를 비워놓습니다.
		// 반환값이 없으면 자료형은 void로 하고 return 생략
		// return;
		
		// 오로지 코드 재사용
		int num = 1;
		System.out.println("나는 메서드" + num +"에 저장된 코드다.");
	}
	
	// 메서드2 : 반환값x, 입력값o(코드 재활용, 일부만 변수만 경우)
	void 메서드2(String str1, String str2) {
		System.out.println("소괄호로 넘어오는 값만 변경: " + str1);
		System.out.println("코드재활용: "+str2);
	}
	
	// 메서드3 : 반환값O, 입력값X (코드 재사용, 메서드 사용 후에 마지막으로 전달해줄 값이 있음)
	String 메서드3() {
		// 메서드의 자료형은 return 값의 자료형을 적어준다.
		String result = "반갑습니다.";
		System.out.println("메서드3을 사용");
		
		return result;
	}
	
	// 메서드4 : 반환값O, 입력값O
	int 메서드4(double dnum) {
		// 입력값이 있으면()를 변수로 채워놓고
		// 반환값이 있으면 return을 사용하고 맨 앞의 자료형을 맞춰준다.
		System.out.println("실수 자료형을 반올림합니다.");
		double result = dnum - (int)dnum;
		if(result >= 0.5) {
			dnum += 1.0;
		}
		return (int)dnum;
	}
}