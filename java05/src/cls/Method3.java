package cls;

public class Method3 {
	public static void main(String[] args) {
		MyClass7 mc7 = new MyClass7();
		int result1 = mc7.더하기(1, 2);
		System.out.println(result1);
		
		int result2 = mc7.빼기(3.14, 1.28);
		System.out.println(result2);
		
		int result3 = mc7.곱하기(3, 8);
		System.out.println(result3);
		
		double result4 = mc7.나누기(8, 0);
		System.out.println(result4);
		
		int result5 = mc7.나머지(10, 3);
		System.out.println(result5);
	}
}
class MyClass7{
	int 더하기(int num1, int num2) {
		int result1 = num1 + num2;
		return result1;
	}
	int 빼기(double num1, double num2) {
		double result2 = num1 - num2;
		return (int)result2;
	}
	int 곱하기(int num1, int num2) {
		int result3 = num1 * num2;
		return result3;
	}
	double 나누기(int num1, int num2) {
		double result4 = 0.0;
		if(num2 == 0) {
			return result4;
		}
		else{
			result4 = num1/num2;
			return result4;
		}
	}
	int 나머지(int num1, int num2) {
		int result5 = 0;
		for(;;) {
			if(num1 < num2) {
				break;
			}
			num1 -= num2;
		}
		return num1;
	}
}

