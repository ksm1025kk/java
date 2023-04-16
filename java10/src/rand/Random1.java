package rand;

import java.util.Random;
import java.util.Scanner;

import time.GetInstance;

public class Random1 {
	public static void main(String[] args) {
		// 자바에서 랜덤을 사용하는 법
		// math클래스, Random 클래스 사용
		
		Myrandom md = new Myrandom();
		MyRand mc = MyRand.getInstance();
		MyRando me = MyRando.getInstance();
		
		md.go1();
		md.go2();
		md.go3();
		mc.go4(17, 20);
		me.go5();
		
	}
}

class Myrandom{
	// nextInt() : 0 ~ 0.999999까지 랜덤 후 int로 형변환
	public void go1() {
		// 0 ~ 9 랜덤
		
		Random random = new Random();
		int result = random.nextInt(10);			// nextInt(10) : 0*10 ~ 0.9999*10
		System.out.println(result);
	}
	
	public void go2() {
		// 100 ~ 105까지 랜덤
		Random random = new Random();
		int result = random.nextInt(6)+ 100 ;				// (0 * 6 ~ 0.9999 * 6) + 100
		System.out.println(result);
	}
	
	public void go3(){
		// 1부터 10까지
		Random random = new Random();
		int result = random.nextInt(9)+1;				// (0*9 ~ 0.9999*9) + 1
		System.out.println(result);
	}
}
class MyRand{
	private MyRand() {}
	
	private static MyRand instance;
	
	// 객체 멤버변수를 반환해줄 static 메서드 : getInstance()
	public static MyRand getInstance() {
		if(instance == null) {
			instance = new MyRand();
		}
		return instance;
	}
	public int go4(int num1, int num2) {
		int num3 = 0;
		if(num1 > num2) {
			num3 = num1;
			num1 = num2;
			num2 = num3;
		}
		Random random = new Random();
		int result = random.nextInt(num2-num1+1) + num1;					// (0*3 ~ 0.9999*3) + 17
		System.out.println(result);
		return result;	
		
	}
}

class MyRando{
	private MyRando() {}
	
	private static MyRando instance;
	
	// 객체 멤버변수를 반환해줄 static 메서드 : getInstance()
	public static MyRando getInstance() {
		if(instance == null) {
			instance = new MyRando();
		}
		return instance;
	}
	public int go5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("num4를 입력하세요>> ");
		int num4 = sc.nextInt();
		System.out.println("num5를 입력하세요>> ");
		int num5 = sc.nextInt();
		
		int num6 = 0;
		
		if(num4 > num5) {
			num6 = num4;
			num4 = num5;
			num5 = num6;
		}
		Random random = new Random();
		int result = random.nextInt(num5-num4+1) + num4;					// (0*3 ~ 0.9999*3) + 17
		System.out.println(result);
		
		sc.close();
		return result;
	}
}
