package cls;

public class Class5 {
	public static void main(String[] args) {
		MyClass9 mc9 = new MyClass9();
}

class MyClass9{
	int num1;
	int num2;
	String str;
	double dnum;
	

	}
	
	void setVar(int num1, int num2, String str,  double dnum) {
		int var = 0;
		this.num1 = num1;
		this.num2 = num2;
		this.str = str;
		this.dnum = dnum;
	}
		
		
		
		
	public int getNum1() {
	return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public double getDnum() {
		return dnum;
	}
	public void setDnum(double dnum) {
		this.dnum = dnum;
	}
	
	
}