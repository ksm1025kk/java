package cls;

public class Method1 {
	public static void main(String[] args) {
		// 매서드 사용방법()
		// 함수명()
		int result = 3+4;			// 3과 4를 더한 결과를 반환(7)
		// int err = 3+;			// + 기호는 앞 뒤로 숫자를 한개씩 넣어줘야함
		MyClass4 mc4 = new MyClass4();
		int result2 = mc4.더하기(3, 4);
		System.out.println(result2);
	}
}

class MyClass4{
	// 매서드 : 클래스 안에 있는 함수, this를 갖고있음
	// 매서드를 만든이유 : 함수에 포인터 사용을 생략하기 위해서
	
	// 매서드를 만드는 방법(){}
	// 자료형 함수명(){}
	
	// + : 숫자 2개를 받아서 합친 결과를 반환
	// 더하기하는 기호를 직접 만들기
	int 더하기(int num1, int num2) {			// 값을 받기 위해선 ()에 변수를 생성해놓는다.
		int result = num1 + num2;			// 받은 값 2개 더한다
		return result;						// 결과값을 반환한다(반환 = 사용한 곳에 전달한다.)	
	}
}