package zijilianxi;

public class men extends people {
   public static void main(String[] args) {
	
	  //继承父类所拥有的方法
	men men=new men();
	 /*men.setHeight("身高1.70米");
	 men.setAge(18);
	 men.setSex("男");
	 men.setName("奶糖");
	 men.setRun("跑着去");
	 System.out.println(men.getName()+men.getSex()+men.getAge()+men.getHeight()+men.getRun()+"泡妞");*/
	 men.method();
	 men.method2();
}

@Override
public int method() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void method2() {
	// TODO Auto-generated method stub
	
}

}
