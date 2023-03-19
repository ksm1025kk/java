package operator;

public class Oper6 {
	public static void main(String[] args) {
		// 관계연산자
		// && 	|| 	 ! 
		// and 	or 	not
		// true, false에 영향을 줌
		
		System.out.println(2 > 1 && 2 == 2);
		
		int 키 = 120;
		int 나이	= 14;
		
		// 키는 130이상이고 나이는 13살 이상이어야한다
		boolean 참거짓 = 키 >= 130 && 나이 >= 13;
		// && 기호는 앞과 뒤가 모두 맞아야 true
		System.out.println(참거짓);
		
		// 키가 130 이상이거나 나이가 13살 이상이어야한다
		참거짓 = 키 >= 130 || 나이 >= 13;
		System.out.println(참거짓);
		// || 기호는 앞 뒤중 하나만 맞아도 true
		
		// ! 기호는 결과를 반대로 바꿔줌, true -> false, false -> true
		System.out.println(!참거짓);
		
		
		
	}
}
