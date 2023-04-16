package time;

public class Static {
	static String str1 = "안녕하세요";
	static String str2 = "반갑습니다";
	static int num1 = 314;
	static int nums[] = new int[100];				// 성능이 굉장히 느려짐
	
	public static void main(String[] args) {
		Test.print();
		
		
		Singleton singleton = Singleton.getInstance();		// getInstance()메서드에서 "new"를 담당함
		singleton.setStr("안녕하세요. 싱글턴입니다.");
		System.out.println(singleton.getStr());
				
	}
}



class Test{
	public static void print() {
		System.out.println(Static.str1);
		Static.nums[0] = 0;
		Static.nums[1] = 1;
		Static.nums[2] = 2;
		System.out.println(Static.num1);
	}
}