package cls;

public class Class7 {
	public static void main(String[] args) {
		// 객체화
		Human 홍길동 = new Human();
		Human 유관순 = new Human();
		HumanView inf = new HumanView();
		
		홍길동.setName("홍길동");
		홍길동.setGender("남");
		홍길동.setAge(32);
		
		유관순.setName("유관순");
		유관순.setGender("여");
		유관순.setAge(26);
		
		inf.PrintInfo(홍길동);
		inf.PrintInfo(유관순);
	}
}
// 멤버변수는 private, 메서드는 public
class Human{
	// 데이터 : name, gender, age
	private String name;
	private String gender;
	private int age;
	
	// 입력은 set
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 사용은 get
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
}
class HumanView{
	public void PrintInfo(Human human) {
		// 이름 성별 나이를 한번에 출력
		System.out.println(human.getName()+"은 " +human.getGender() + "성이며 나이는 " + human.getAge() + "세 입니다.");
		System.out.println(human.getName()+" / " +human.getGender() + "성 / " + human.getAge() + "세");
	}
}