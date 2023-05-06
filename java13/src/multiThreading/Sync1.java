package multiThreading;

public class Sync1 {
	public static void main(String[] args) {
		// 멀티쓰레드환경에서 
		// '동기화'synchronized
		// 클래스를 동기화해서 여러 쓰레드가 동시에 접근하는 것을 금지함
		// Runnable
		Toilet t1 = new Toilet();					// 화장실
		Thread 홍길동 = new Thread(t1, "홍길동");				// 사람1
		Thread 이순신 = new Thread(t1, "이순신");				// 사람2
		
		홍길동.start();
		이순신.start();
		
	}
}

class Toilet implements Runnable{
	private int time;			// 10초동안 사용 (동시사용은 불가)
		
	@Override
	public void run() {
		synchronized (this) {					// 이 클래스는 동기화시킬것이다
			String name = Thread.currentThread().getName();	// 쓰레드 이름받기
			time = 0;
			System.out.println(name + "화장실 들어감");
			for(time = 1; time<10; time++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name + "화장실 사용중... "+ time +"초");	
			}
			System.out.println(name + "화장실 나옴");			
		}
	}
}