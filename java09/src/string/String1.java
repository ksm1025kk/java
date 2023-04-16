package string;

public class String1 {
	public static void main(String[] args) {
		// String 문자열 (자바에서 제공해주는 클래스)
		String str = "hello world!";
		
		// 두 문자열이 같은지 비교하는 메서드 equals
		boolean result = str.equals("hello world");
		System.out.println(result);
		
		if(str.equals("hello world")) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		// 해당 문자열을 포함하는지 검사 contains
		if(str.contains("hell")) {
			System.out.println("갖다");
		}else {
			System.out.println("없다");
		}
		
		// 교체 : replace
		String result2 = str.replace("hello", "hi");
		System.out.println(result2);
		
		// 글자수 알려주기 length()
		System.out.println(str.length());
	
		// 글자의 시작 위치를 알려주기 : indexOf()
		int result3 = str.indexOf("world");
		System.out.println(result3);
		
		// 위치를 알려주면 해당하는 글자를 알려주기 charAt()
		char result4 = str.charAt(1);
		System.out.println(result4);
		
		// 잘라내기(추출하기) substring(num1, num2 ) : num1번방부터 num2번방 전까지
		result2 = str.substring(1, 5); 	// 1~4번방을 잘라냄
		System.out.println(result2);
		
		// 합치기
		str = str + "@@";
		System.out.println(str);
		
		
		// quiz 1. "길동"만 추출해서 출력
		String src = "홍길동";
		// "홍길동" = ["홍", "길", "동", 0]
		String result5 = src.substring(1, 3);
		System.out.println(result5);
		
		int gil = src.indexOf("길");
		int dong = src.indexOf("동");
		String result7 = src.substring(gil, dong+1);
		System.out.println(result7);
		
		
		// quiz 2. "src2 변수에서 홍길동을 장보고로 바꿔서 출력
		String src2 = "안녕하세요 저는 홍길동입니다. 올해 23살 입니다.";
		String result6 = src2.replace("홍길동", "장보고");
		System.out.println(result6);	
	}
}
