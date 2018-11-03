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
public class Multithread {

	public static void main(String[] args) throws InterruptedException {
		Mythread t1 = new Mythread(0,5);
		t1.start();
		t1.sleep(10);
		Mythread t2 = new Mythread(6,11);
		t2.start();

	}

}