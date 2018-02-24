package zijilianxi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.print.DocFlavor.INPUT_STREAM;

public class Test {
	public static void main(String[] args) throws IOException{
		//创建File类，本身就是一个类，后面参数传文件地址，不能是图片
  File file=new File("E:\\HTML\\css\\02.css");
  //判断文件是否存在
  System.out.println(file.exists());
  //判断是文件还是文件夹
  System.out.println(file.isFile());
  //获取文件名
  System.out.println(file.getName());
  //获取绝对路径
  System.out.println(file.getAbsolutePath());
  //创建新文件名
  System.out.println(file.createNewFile());
  
  InputStream is=new FileInputStream(file);
  byte[] b=new byte[(int) file.length()];
  
  is.read(b);
  System.out.println(new String(b));
  
 }
}
