package day15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Stream3 {

	public static void main(String[] args) {
		MyProgram mp = new MyProgram();
		mp.putText("C:\\Users\\Administrator\\Desktop\\myp.txt");
	}

}
class MyProgram{
	public void putText(String file) {
		FileOutputStream fout = null;
		try {
			FileOutputStream fout1 = new FileOutputStream(file,true);
			Scanner sc = new Scanner(System.in);
			System.out.println("입력할 내용 :");
			String msg = sc.nextLine();
			
			byte[] byteArray = msg.getBytes();
			
			fout1.write(byteArray);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
	}
	}

}