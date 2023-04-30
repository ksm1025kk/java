package collection_;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyDictionary md = new MyDictionary();
		int choice = -1;
		String str1 = "";
		String str2 = "";
		String str3 = "";
		
		while(true) {
			System.out.println("1.추가 2.변경 3.삭제 4.조회 0.종료");
			choice = Integer.parseInt(sc.nextLine());
			if(choice == 1) {
				System.out.println("추가할 영단어를 입력하세요");
				str1 = sc.nextLine();
				System.out.println("추가할 한국어를 입력하세요");
				str2 = sc.nextLine();
				md.addWord(str1, str2);
			}
			else if(choice == 2) {
				System.out.println("변경할 영단어를 입력하세요");
				str1 = sc.nextLine();
				System.out.println("변경후 영단어를 입력하세요");
				str2 = sc.nextLine();
				System.out.println("변경후 한국어를 입력하세요");
				str3 = sc.nextLine();
				md.setWord(str1, str2, str3);
			}
			else if(choice == 3) {
				System.out.println("삭제할 영단어 또는 한국어를 입력하세요");
				str1 = sc.nextLine();
				md.deleteWord(str1);
			}
			else if(choice == 4) {
				md.showAll();
			}
			else if(choice == 0) {
				System.out.println("끝내기");
				sc.close();
				break;
			}
		}
	}
}
// 한영사전 만들기
// 생성자에 단어 3개 정도 입력
class MyDictionary{
	private HashMap<String, String> hmm = new HashMap<>();
	// 멤버변수 private
	
	// 메서드변수 public
	public MyDictionary() {
		hmm.put("apple", "사과");
		hmm.put("flower", "꽃");
		hmm.put("sea", "바다");
	}
	public void addWord(String str1, String str2) {
		hmm.put(str1, str2);
	}
	public void setWord(String str1, String str2, String str3) {
		hmm.remove(str1);
		hmm.put(str2, str3);
	}
	public void deleteWord(String str1) {
	    if(hmm.containsKey(str1)) {
	        hmm.remove(str1);
	    } else {
	        String key = null;
	        for (String k : hmm.keySet()) {
	            if (hmm.get(k).equals(str1)) {
	                key = k;
	                break;
	            }
	        }
	        if (key != null) {
	            hmm.remove(key);
	        }
	    }
	}
	public void showAll() {
		Set<String> set = hmm.keySet();
		for(String e : set) {
			System.out.print(e);				// key
			System.out.println(hmm.get(e));      // value
		}
	}
}