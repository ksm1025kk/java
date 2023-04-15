package except;

import java.util.Scanner;

public class Try2 {
	public static void main(String[] args) {
		// 형변환 String-> int
		int c= 0;
		String str = "글자";
		try {
			c = Integer.parseInt(str);
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("숫자만 가능"+ e);
		}
	}
	
}

