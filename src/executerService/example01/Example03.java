package executerService.example01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example03 {
	public static void main(String [] args){
		ExecutorService service = null;
		Future<Integer> f = null;
		try{
			service = Executors.newSingleThreadExecutor();
			f = service.submit(new Callable<Integer>() {
			
				
				@Override
				public Integer call() {
					int count = 0;
					try{
						for(int x = 1; x <= 10; x++){
							Thread.sleep(1000);
							System.out.println("Task No "+x+" getting completed");
						}
						
						count = 1;
					}catch(Exception e){
						count = -1;
						e.printStackTrace();
						
					}
					
					return count;
				}
			});
			
			if(f.get() != 1 || f.get() != -1){
				System.out.println("Task Completed Successfully...");
			}
			
			service.shutdown();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
