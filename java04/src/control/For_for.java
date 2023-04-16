package control;

public class For_for {
	public static void main(String[] args) {
		// 이중 반복문 사용할 수 있음
		// 한번 반복할 때마다 안쪽에 있는 반복문을 수행
		
		for(int i = 0; i < 3; i++) {
			System.out.println("==i:" + i +"==");
			for(int j = 0; j < 3; j++) {
				//System.out.println("i=" + i + ", j=" + j);
				System.out.println("j:" + j);
			}
			System.out.println(" ");
		}
	}
}
