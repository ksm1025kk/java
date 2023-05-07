package iostream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Stream2 {
	public static void main(String[] args) {
		// File 클래스를 통해서 파일을 읽고쓰기
		// Stream : input == 내 프로그램으로 가져온다. output == 내 프로그램에서 내보낸다.
		ControlFile cf = new ControlFile();
		MyFile mf = new MyFile();
		
		//cf.putFile("C:\\log\\login.txt");
		//cf.readFile("C:\\log\\log.txt");
		//cf.cfile("C:\\log\\"); 
		//cf.deletefile("C:\\log\\ddd.txt");
		//mf.rfile("C:\\log\\login.txt");
		//mf.createFile("C:\\log\\");	
		//mf.pfile("C:\\log\\ddd.txt");
		//mf.dfile("C:\\log\\login.txt");
	}
}

class ControlFile{
	Scanner sc = new Scanner(System.in);
	public void readfile(String path) {
		// FileInputStream : 파일(File)에 있는 데이터를 내 프로그램(Stream)으로 가져온다(Input).
		FileInputStream fis = null;				// null을 넣는 이유는 try-catch 때문
		
		try {
			fis = new FileInputStream(path);
			// utf-8 이라는것을 알려줌
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);					// byte -> String
			
			String str = null;
			while((str = br.readLine()) != null) {				// 한줄을 읽어 str에 저장하고 null인지 비교
				System.out.println(str);						// 읽어왔다면 출력
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일읽기실패");
		}catch(Exception e) {
			System.out.println("변환실패");
		}finally {
			// try를 실행하건 catch를 실행하건 무조건 마무리 작업
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void createfile(String path) {
		System.out.println("파일명을 입력하세요");					
		String fname = sc.next();								
		File file = new File(path + fname + ".txt");			
		if(file.exists()) {										
			System.out.println("이미 존재하는 파일입니다.");		
			return;											
		}												
		try {
			file.createNewFile();								
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(fname + " 파일이 생성되었습니다.");			
	}
	
	// 입력하기 : 내 프로그램 -> 운영체제 프로그램(OutputStream)
	public void putfile(String pathfile) {						
		FileOutputStream fos = null;							
		
		try {
			fos = new FileOutputStream(pathfile);				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("입력할 내용>>");						
		String str = sc.nextLine();								
		str +="\n";												
		
		// 파일로 옮기기위해서는 바이트단위로 바꿔야함
		byte[] byteArray = str.getBytes();						
		try {
		fos.write(byteArray);									
		System.out.println("입력성공");							
		}
		catch(IOException e) {
			e.printStackTrace();
		}finally {												
			try {
				fos.close();									
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void deletefile(String _file) {
		File file = new File(_file);			// 파일경로와 확장자를 입력하면 삭제해줌
		boolean result = file.delete();
		if(result == true) {
			System.out.println("성공");
		}
		else {
			System.out.println("실패");
		}
	}
}

class MyFile{

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
	// 파일만들기
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
	
	public void pfile(String pathfile) {
		FileOutputStream fo = null;
		try {
			fo = new FileOutputStream(pathfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("입력");
		String str = sc.nextLine();
		str +="\n";
		
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