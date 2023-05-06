package multiThreading;

import java.util.Scanner;

public class Mythread5 {
	public static void main(String[] args) {
		MyModel mm = new MyModel();	
		Savelist s1 = new Savelist(mm);
		Printlist p1 = new Printlist(mm);
		
		mm.list.add("sample 0");
		// 만약 하나의 쓰레드가 완료될 때까지 다른 쓰레드가 대기하고 싶으면
		// join() 메서드를 사용
		
		// 하나의 쓰레드에서는 list에 값 저장을
		s1.start();
		// s1 쓰레드가 수행되기 전까지 다른 쓰레드는 대기하라 join
		try {
			s1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 다른 하나의 쓰레드에서는 전체출력
		p1.start();
	}
}

class Savelist extends Thread{
	private MyModel mm;
	
	public Savelist (MyModel myModel) {		// 생성자
		mm = myModel;									// 객체의 주소를 전달받는다.			
	}
	public void run(){
		Scanner sc = new Scanner(System.in);
		String str = "";
			while(true) {
				if(str.equals("0")){
					break;
				}
			System.out.println("저장할 항목을 입력하세요(0을 입력하면 종료)>> ");
			str = sc.nextLine();
			mm.list.add(str);			// Arraylist 에 추가
		}
		sc.close();
	}			// run()
}				// avelist{}


class Printlist extends Thread{
	private MyModel mm;
	
	public Printlist(MyModel mm) {
		this.mm = mm;
	}
	public void run() {
		for(String str : mm.list) {
			System.out.println(str + "");
		}
	}				// run()
}