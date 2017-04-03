package executerService.example01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example01 {
	
	public static void main(String [] args){
		ExecutorService service = null;
		try{
			service = Executors.newFixedThreadPool(3);
			
			Runnable [] tasks = new Runnable[] {
				new Runnable() {
					
					@Override
					public void run() {
						System.out.println(Thread.currentThread().getName()+" Aynthronous Task 1 ");
					}
				},new Runnable() {
					
					@Override
					public void run() {
						System.out.println(Thread.currentThread().getName()+" Aynthronous Task 2 ");
					}
				},new Runnable() {
					
					@Override
					public void run() {
						System.out.println(Thread.currentThread().getName()+" Aynthronous Task 3 ");
					}
				},new Runnable() {
					
					@Override
					public void run() {
						System.out.println(Thread.currentThread().getName()+" Aynthronous Task 4 ");
					}
				},new Runnable() {
					
					@Override
					public void run() {
						System.out.println(Thread.currentThread().getName()+" Aynthronous Task 5 ");
					}
				},new Runnable() {
					
					@Override
					public void run() {
						System.out.println(Thread.currentThread().getName()+" Aynthronous Task 6 ");
					}
				},new Runnable() {
					
					@Override
					public void run() {
						System.out.println(Thread.currentThread().getName()+" Aynthronous Task 7 ");
					}
				},new Runnable() {
					
					@Override
					public void run() {
						System.out.println(Thread.currentThread().getName()+" Aynthronous Task 8 ");
					}
				},new Runnable() {
					
					@Override
					public void run() {
						System.out.println(Thread.currentThread().getName()+" Aynthronous Task 9 ");
					}
				},new Runnable() {
					
					@Override
					public void run() {
						System.out.println(Thread.currentThread().getName()+" Aynthronous Task 10 ");
					}
				}				
			};
			
			for(Runnable task : tasks){
				service.execute(task);
			}		
			
			service.shutdown();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
