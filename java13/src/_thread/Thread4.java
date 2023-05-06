package _thread;

public class Thread4 {
	public static void main(String[] args) {
		// 쓰레드 추가 생성 : Thread 상속받은 클래스
		// 쓰레드 추가 생성 : Runnable 인터페이스 지정받은 클래스
		MyRunnable1  r1 = new MyRunnable1();
		Thread t1 = new Thread(r1);
		
		t1.start();
		
	} 
}

class MyRunnable1 implements Runnable{
	// 인터페이스를 상속받으면 미구현된 메서드에 대해서는
	// 클래스 밑에 빨간줄에 마우스를 올리고 
	// add unimplemented methods를 클릭한다.

	@Override
	public void run() {
		for(int i = 0; i<20; i++) {
			System.out.println("Runnable");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}