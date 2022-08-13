package day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.FileLock;
import java.util.Scanner;

public class Stream2 {

	public static void main(String[] args) {
		MakeFile mf =  new MakeFile();
		//mf.make("C:\\");
		//mf.putText("C:\\myYext.txt");
		mf.putText("C:\\myText.txt");
	}

}


class MakeFile{
	public int make(String path) {
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 파일 이름을 생성하세요(확장자까지)>>");
		String fileName = sc.next();
		File makeFile = new File(path);
		try {
			makeFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일 생성에 실패했습니다.");
			return -1; 					// 파일 생성에 실패했을 경우 메서드를 종료하면서 -1을 리턴
		}
		if(makeFile.exists());
		System.out.println("파일 생성 완료!");
	
		return 1;
	}

public int delete(String path) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 파일 이름을 생성하세요(확장자까지)>>");
		String fileName = sc.next();
		File file = new File(path + fileName);
		
		
		if (file.delete()) {
			System.out.println("삭제 성공!");
			return 1;
		
		}else {
			System.out.println("삭제 실패!");
			return -1;
		}
}
}
// 파일 내용 입력하기(OutputStream)
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
			fout.close();
	}
	}
	public void redText(String file) {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fin,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			while((read = fin.read()) != -1) {
				System.out.println((char)read);
				
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 읽기 실패");
		}finally {
			fout.close();
		fin = new FileInputStream(file);
		int read = -1;
		}
		
		}
	}
}