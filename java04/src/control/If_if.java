package control;

public class If_if {
	public static void main(String[] args) {
		// 제어문은 중첩해서 사용할 수 있음
		// if 안에 if, for안에 for, if 안에 for, for안에 if
		int i = 0;
		int j = 0;
		
		if (i < 0) {
			// 0 보다 작으면
			if (j < 0) {
				// 0 보다 작으면
				System.out.println("i는 0보다 작다. j는 0보다 작다.");
			}
			else if(j == 0) {
				// 0이면
				System.out.println("i는 0보다 작다. j는 0이다.");
			}
			else {
				// 0보다 크면
				System.out.println("i는 0보다 작다. j는 0보다 크다.");
			}
		}
		else if(i == 0) {
			// 0이면
			if (j < 0) {
				// 0 보다 작으면
				System.out.println("i는 0이다. j는 0보다 작다.");
			}
			else if(j == 0) {
				// 0이면
				System.out.println("i는 0이다. j는 0이다.");
			}
			else {
				// 0보다 크면
				System.out.println("i는 0이다. j는 0보다 크다.");
			}
		}
		else {
			// 0보다 크면
			if (j < 0) {
				// 0 보다 작으면
				System.out.println("i는 0보다 크다. j는 0보다 작다.");
			}
			else if(j == 0) {
				// 0이면
				System.out.println("i는 0보다 크다. j는 0이다.");
			}
			else {
				// 0보다 크면
				System.out.println("i는 0보다 크다. j는 0보다 크다.");
			}
		}
	}
}
