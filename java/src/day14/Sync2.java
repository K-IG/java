package day14;

import day14.Key.MyThread;

public class Sync2 {

	public static void main(String[] args) {
		Key key=new Key();
		MyThread thread1=new MyThread("A",key);
		MyThread thread2=new MyThread("B",key);
		
		thread1.start();
		thread2.start();

	}

}
class Key {
	private int time = 0;
	public void close(String name){
		System.out.println(name+"화장실 사용중");
	}
	public void defecate(String name){
		System.out.println(name+"대기중");
	}
	public void useToilet(String name){
		while(time < 10) {
		synchronized(this){
			defecate(name);
			close(name);
		}
	}
	
}

class MyThread extends Thread{
	private String name;
	private Key key;
	public MyThread(String name,Key key){
		this.name=name;
		this.key=key;
	}
	public void run(){
		key.useToilet(name);
	}
}
}