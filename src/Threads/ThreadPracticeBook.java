package Threads;

class NewThread implements Runnable{
	String threadName;
	Thread t;
	NewThread(String threadName){
		this.threadName = threadName;
		t = new Thread(this,"Thread One");
		System.out.println("New Thread : " + t);
	}

	@Override
	public void run() {
		try{
			for (int i = 0; i < 5; i++) {
				System.out.println(threadName + " : " + i);
				Thread.sleep(500);
			}
		}catch (InterruptedException e){
			System.out.println(e);
		}
		System.out.println(threadName + " : EXITING");
	}
}


class CallMe{
	void call(String msg){
		System.out.print("[" + msg);
		try{
			Thread.sleep(1000);
		}catch (InterruptedException e){
			System.out.println("Interrupted " + e);
		}
		System.out.println("]");
	}
}

class Caller implements Runnable{
	String msg;
	CallMe target;
	Thread t;
	Caller(CallMe target,String msg){
		this.msg = msg;
		this.target = target;
		t = new Thread(this);
	}
	@Override
	public void run() {
		synchronized (target) {
			target.call(msg);
		}
	}

}

public class ThreadPracticeBook {

	public static void main(String... args){
		CallMe target = new CallMe();
		Caller c1 = new Caller(target,"Hello");
		Caller c2 = new Caller(target,"From");
		Caller c3 = new Caller(target,"The");

		c1.t.start();
		c2.t.start();
		c3.t.start();



	}
}
