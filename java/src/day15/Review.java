package day15;

public class Review {

	public static void main(String[] args) {
		//쓰레드 : 실행중인 프로그램 (프로세스) 내부에서 실질적으로 업무수행을 하는 단위
		MyThread mt = new MyThread();
		MyThread2 mt2 = new MyThread2();
		Thread mtt2 = new Thread(mt2);
		
		mt.start();					//run 메서드의 내용이 추가쓰레드로 실행
		mtt2.start();

	}

}
//추가 쓰레드 : 메인쓰레드와는 별개로 동작하기 위해서
class MyThread extends Thread{
	// 쓰레드 클래스를 상속받아서 run에 구현 -> main에서 start로 ㅅ ㅣㄹ행
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("추가쓰레드1");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
class MyThread2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("추가쓰레드2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
	
}