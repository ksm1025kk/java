package operator;

public class Oper3 {
	public static void main(String[] args) {
		boolean 참거짓 = true;
		참거짓 = false;
		
		참거짓 = 3 > 2;		// true
		System.out.println(참거짓);
		참거짓 = 3 < 2;
		System.out.println(참거짓);
		참거짓 = 3 >= 2;
		System.out.println(참거짓);
		참거짓 = 3 <= 2;
		System.out.println(참거짓);
		
		System.out.println(3>2);
		
		// = : 대입연산자(오른쪽에 있는 값을 왼쪽에 넣는다)
		// == : 같다 (수학의 = )
		// != : 다르다 
		
		참거짓 = 2 == 2;
		System.out.println(참거짓);
		참거짓 = 2 != 2;
		System.out.println(참거짓);
		
	}
}
