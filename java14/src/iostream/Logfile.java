package iostream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Logfile {
	public static void main(String[] args) {
		// log 파일 : 일반적으로 통신이나 stream 작업을 할 때 오류가 발생
		// 데이터를 주고받은 이력을 기록
		// 입력
		
		// 무한으로 입력하고 출력시키는 프로그램(==> 출력시키기전에 입력내용을 파일에 기록)
		Scanner sc = new Scanner(System.in);
		MyFilei mmm = new MyFilei();
		String str = "";
		while(true) {
			System.out.println("출력할 내용을 입력>>");
			str = sc.nextLine();			// 입력
			// str 변수에 log 파일에 기록
			mmm.pfile("C:\\log\\log.txt", str);						// 파일 경로와 기록 내용
			System.out.println(str);		// 출력
		}
		
		
	}
}
class MyFilei{
	Scanner sc = new Scanner(System.in);
	
	public void rfile(String path) {
		FileInputStream fs = null;
		try {
			fs = new FileInputStream(path);
			InputStreamReader in = new InputStreamReader(fs, "UTF-8");
			BufferedReader bb = new BufferedReader(in);
			
			String str1 = null;
			while((str1 = bb.readLine()) != null) {
				System.out.println(str1);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("");
		}catch(Exception e) {
			System.out.println("");
		}finally {
			try {
				fs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void cfile(String path){
	System.out.println("파일명을 입력하세요> ");
	String filename = sc.next();
	File file = new File(path + filename + ".txt");
	if(file.exists()) {
		System.out.println("이미 존재하는 파일입니다.");
		return;
	}
	try {
		file.createNewFile();
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println(filename + "파일을 생성했습니다.");
	}
	
	public void pfile(String pathfile, String str) {
		FileOutputStream fo = null;
		try {
			fo = new FileOutputStream(pathfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		str += "\n";
		
		byte[] byteArray = str.getBytes();
		try {
			fo.write(byteArray);
			System.out.println("성공");
		} catch (IOException e) {
			e.printStackTrace();
		
		}finally {
			try {
				fo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void dfile(String __file) {
		File file = new File(__file);
		boolean result = file.delete();
		if(result == true) {
			System.out.println("성공");
		}
		else {
			System.out.println("실패");
		}
	}
	
	public void fileFound(String path) {
		System.out.println(path+"안에 있는 파일을 검색");
		
		// File 클래스 이용
		File file = new File(path);			// 해당 경로안에 모든 파일명이 배열형태로 저장
		for(String name : file.list()) {
			System.out.println("파일: "+name);
		}
	}
}