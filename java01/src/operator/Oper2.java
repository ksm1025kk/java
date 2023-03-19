package operator;

public class Oper2 {
	public static void main(String[] args) {
		int 국어 = 50;
		int 영어 = 40;
		int 수학 = 59	;
		int 합계 = 국어 + 수학 + 영어;
		System.out.println("합계는 : " + (국어+영어+수학) + "점");
		System.out.println("평균은 : " + (국어+영어+수학)/3 + "점");
		System.out.println("합계는 : "+합계+"점");
		System.out.println("평균은 : "+(합계/3)+"점");
		System.out.println("평균은 : "+((double)합계/3)+"점");
	}
}
