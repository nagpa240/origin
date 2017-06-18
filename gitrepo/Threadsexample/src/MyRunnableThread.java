
public class MyRunnableThread implements Runnable {

	public void run(){  
		
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
		MyRunnableThread m1=new MyRunnableThread();  
		Thread t1 =new Thread(m1);  
		t1.start();  
		 }  
		
}
	


