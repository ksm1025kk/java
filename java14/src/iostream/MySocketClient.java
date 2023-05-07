package iostream;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MySocketClient {
	public static void main(String[] args) {
		// 채팅프로그램
		// IP : 해당컴퓨터의 주소, Port : 프로그램의 식별코드
		// 네트워크를 통해 메세지를 주고받을때에는 Socket 을 사용
		// 클라이언트1 -- 서버 -- 클라이언트2
		
		MyClient user = new MyClient();
		user.start();
	}
}
class MyClient extends Thread{
	Socket socket;
	InputStream is;				// 서버의 메세지 받을 때
	OutputStream os;			// 서버로 메세지 보낼 때
	ObjectInputStream ois;		// 매핑
	ObjectOutputStream oos;		// 매핑
	
	// 임시입력용 scanner
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void run() {
		// 해당 컴퓨터와 연결(IP, Port)\ 
		try {
			socket = new Socket("192.168.3.101", 8089);		// 소켓을 생성(이제부터 통신가능)
			os = socket.getOutputStream();
			is = socket.getInputStream();
			oos = new ObjectOutputStream(os);			// 보낼준비
			ois = new ObjectInputStream(is);			// 받을준비
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		while(true) {
			// 주고받고 무한반복
			sendmessage();
			recvmessage();
		}
	}

	// 서버로 메세지를 보내는 함수
	public void sendmessage() {
		System.out.println("보낼메세지: ");
		String msg = sc.nextLine();
		try {
			oos.writeObject(msg);
			oos.flush();					// 버그방지 (보내고나서 쓰레기값이 남아있을 수 있기 때문에 비움)
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 서버가 보내온 메세지를 받는 함수
	public void recvmessage() {
		String msg = "";
		try {
			msg = (String) ois.readObject();	// 서버로부터 메세지를 받는다.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}										
		System.out.println(msg);	    		// 임시용 출력
		
	}
}