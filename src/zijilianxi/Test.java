package zijilianxi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.print.DocFlavor.INPUT_STREAM;

public class Test {
	public static void main(String[] args) throws IOException{
		//����File�࣬�������һ���࣬����������ļ���ַ��������ͼƬ
  File file=new File("E:\\HTML\\css\\02.css");
  //�ж��ļ��Ƿ����
  System.out.println(file.exists());
  //�ж����ļ������ļ���
  System.out.println(file.isFile());
  //��ȡ�ļ���
  System.out.println(file.getName());
  //��ȡ����·��
  System.out.println(file.getAbsolutePath());
  //�������ļ���
  System.out.println(file.createNewFile());
  
  InputStream is=new FileInputStream(file);
  byte[] b=new byte[(int) file.length()];
  
  is.read(b);
  System.out.println(new String(b));
  
 }
}
