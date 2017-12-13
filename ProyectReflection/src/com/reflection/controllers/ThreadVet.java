package com.reflection.controllers;

public class ThreadVet implements Runnable {

	@Override
	public void run() {
		Thread t = new Thread();
		for(int i = 0; i < 250; i++){
			System.out.println(i);
			if(i < 600){
				try {
					t.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		ThreadVet v = new ThreadVet();
		v.run();
	}

}
