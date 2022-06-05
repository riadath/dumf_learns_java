package Threads;

import Threads.ThreadColor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


class ThreadOne extends Thread {
	@Override
	public void run() {
		System.out.println(Threads.ThreadColor.ANSI_BLUE + "Thread One Starts");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(ThreadColor.ANSI_RED + "Thread One Interrupted");
			return;
		}
		System.out.println(Threads.ThreadColor.ANSI_BLUE + "Thread One Ends");
	}
}

class ThreadTwo extends Thread{
	@Override
	public void run() {
		System.out.println(Threads.ThreadColor.ANSI_GREEN + "Thread Two Starts");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(Threads.ThreadColor.ANSI_RED + "Thread Two Interrupted");
			return;
		}
		System.out.println(Threads.ThreadColor.ANSI_GREEN + "Thread Two Ends");
	}
}

public class ThreadPrac {

	public static void main(String... args) {



		ThreadOne threadOne = new ThreadOne();
		threadOne.start();
//        ThreadTwo threadTwo = new ThreadTwo();
		ThreadTwo threadTwo = new ThreadTwo(){
			@Override
			public void run(){
				super.run();
				try{
					threadOne.join();
				}catch (InterruptedException e){
					System.out.println(Threads.ThreadColor.ANSI_RED + "Thread Two Interrupted");
				}
			}
		};
		threadTwo.start();



		Thread runnableThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Threads.ThreadColor.ANSI_GREEN + "Runnable Thread Starts");
				try {
					threadOne.join(1000);
					System.out.println(Threads.ThreadColor.ANSI_GREEN + "Runnable Thread Ends");
				} catch (InterruptedException e) {
					System.out.println(Threads.ThreadColor.ANSI_RED + "could not wait, InterruptedException");
				}
			}
		});
		runnableThread.start();
	}
}
