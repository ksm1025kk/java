package array;

public class ArrArr {
	public static void main(String[] args) {
		// 이차원 배열
		// 배열을 전체사용(출력)하려면 반복문 사용
		// 이차원 배열을 전테 사용하려면 이중 반복문을 사용
		
		int second_arr[][]= {{10, 20},{100,200}};
		for(int i = 0; i < second_arr.length; i++) {
			for(int j = 0; j < second_arr[i].length; j++) {
				System.out.println(second_arr[i][j]);
			}
		}
		System.out.println(second_arr[0][1]);
		System.out.println(second_arr[1][1]);	
	}
}
