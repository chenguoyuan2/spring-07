package zijilianxi;

public  class Main {
	public static void main(String[] args) {
		Mailbload m = new Mailbload();
			Cpu i5 = new I5(); 
			Cpu i7=new I7();
			//m.setI5(I5);
			m.setCpu(i7);
			m.method();//调用接口的方法
	}
}
