package day14;

public class Join2 {

	public static void main(String[] args) {
		Join3 j3 = new Join3();
		Join4 j4 = new Join4();
		j3.start();
		try {
			j3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		j4.start();
		try {
			j4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Join3 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("배경음악1 재생중..................");
			try {
				 MyThread1.sleep(1000); 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Join4 extends Thread {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("배경음악2 재생중...................");
			try {
				MyThread2.sleep(1000); 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}