package multiThreading;


public class Sync2 {
	public static void main(String[] args) {
		// 사람3명(thread 3개)
		Dressroom ds = new Dressroom();
		Thread 홍길동 = new Thread(ds, "홍길동");
		Thread 이순신 = new Thread(ds, "이순신");
		Thread 유관순 = new Thread(ds, "유관순");
		
		홍길동.start();
		이순신.start();
		유관순.start();
	}
}
// 의상탈의실 
// 의류가게에서는 한사람이 옷을 갈아입으러 탈의실에 들어가면 나올때까지 밖에서 대기를 해줘야한다.(10초대기)
class Dressroom implements Runnable{
	private int time;
	
	public void run() {
		synchronized(this) {
			String name = Thread.currentThread().getName();
			time = 0;
			System.out.println(name + " 탈의실 들어감");
			for(int time = 1; time < 11; time++) {
				System.out.println(name + " 탈의실 " + time + "초 사용중");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(name + " 탈의실 나옴");
			
		}		
	}
}

		
		

	
