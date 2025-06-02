package com.java.forkjoinpool;

public class ForkJoinPool {

	public static void main(String[] args) {
		
		ForkJoinPoolExecutor executor= new ForkJoinPoolExecutor(10);
		for(int i=0;i<20;i++) {
			final int taskNum=i;
			executor.submit(() -> {
				System.out.println(" Executing TaskNumber is "+taskNum + " :");
				
			});
		}
		

	}

}
