package operator;

public class Oper5 {
	public static void main(String[] args) {
		// 누적연산자 : 줄인말
		int num = 3;
		num = num;					// 왼쪽에 있는 num과 오른쪽에 있는 num은 다르다.
		// num에 3을 담아라
		
		num = 1 + 2;
		num = num + 2;
		System.out.println(num);			// 5
		
		num +=2;							// num = num + 2;
		
		System.out.println(num);  			// 7
		
		num -= 2;							// 5			num = num - 2;
		num *= 2;							// 10			num = num * 2;
		num /= 2;							// 5			num = num / 2;
		num %= 2;							// 1			num = num % 2;
		System.out.println(num);
		
		// 증감연산자 : 누적으로 더하거나 뺴는 숫자가 1일 경우 한번더 줄일 수 있다.
		// num = num + 1;
		// num += 1;
		num++;
		++num;
		
		// 누적빼기도 가능
		num--;
		--num;
		System.out.println(num);
		
		// ++이 앞에 있으면 먼저 누적으로 더하고 그 줄의 코드 실행
		// ++이 변수보가 뒤에 있으면 그 줄의 코드 실행이 끝나고 더하기
		int i = 0;
		System.out.println(i++);				// 0
		System.out.println(i++);				// 1
		System.out.println(++i);				// 3
		
		
		
	}
}
