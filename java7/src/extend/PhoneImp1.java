package extend;

public class PhoneImp1 {
	public static void main(String[] args) {
		Phone2G p1 = new Phone2G();
		Phone3G p2 = new Phone3G();
		PhoneLTE p3 = new PhoneLTE();
		Phone5G p4 = new Phone5G();
		
		p1.call();
		p2.msg();
		p3.speed();
		p4.bigdata();
	}
}
class Phone2G implements Phone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다.");
	}
	
	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("문자를 보냅니다.");
	}
}
class Phone3G implements Phone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다.");
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("문자를 보냅니다.");
	}
	
	public void inter() {
		System.out.println("인터넷을 합니다.");
	}
	// 전화 문자 인터넷
	
}
class PhoneLTE implements Phone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다.");
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("문자를 보냅니다.");
	}
	
	public void inter() {
		System.out.println("인터넷을 합니다.");
	}
	
	public void speed() {
		System.out.println("속도가 빠릅니다.");
	}
	//전화 문자 인터넷 속도
}

class Phone5G implements Phone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다.");
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("문자를 보냅니다.");
	}
	
	public void inter() {
		// TODO Auto-generated method stub
		System.out.println("인터넷을 합니다.");
	}
	
	public void speed() {
		System.out.println("속도가 빠름.");
	}
	
	public void bigdata() {
		System.out.println("빅데이터 사용.");
	}
	//전화 문자 인터넷 속도 빅데이터
}

