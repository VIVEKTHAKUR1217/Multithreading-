class Mythread extends Thread
{
	private int start=0;
	private int end=0;
	Mythread(int start,int end)
	{
		this.start=start;
		this.end=end;
		
	}
	public void run()
	{
	count();	
	}
   public synchronized  void count()
	{
		for(int i=start;i<=end;i++)
		{
			System.out.println(i);
		}
	}
}
public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {
		Mythread t1 = new Mythread(0,500);
		t1.start();
		Mythread t2 = new Mythread(501,1000);
		t2.start();

	}

}