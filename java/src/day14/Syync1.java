package day14;

public class Syync1 {

	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		Thread human1 = new Thread(toilet, "사람");
		Thread human2 = new Thread(toilet, "사람");
		human1.start();
		human2.start();
	}

}

class Toilet implements Runnable{
	private int time = 0;
	@Override
	public void run() {
		
		synchronized (this) {
			while(time < 10) {
				System.out.println("화장실 사용 중...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				time++;
				System.out.println("화장실 사용 중...."+time+"초");
				
			}
			System.out.println("화장실 비용");
			
		}
	}
	
}
