package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mydatetime2 {
	public static void main(String[] args) {
		Mydate dd = new Mydate();
		
		while(true) {
			System.out.println(dd.now());
			try {
				Thread.sleep(1000);	// 1초동안 프로그램 멈춤
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Mydate{
	// 현재시간을 가져오기
	public String now(){
		String str = null;
		
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();		// 형변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		str = sdf.format(date);
		return str;
		
	}
}
