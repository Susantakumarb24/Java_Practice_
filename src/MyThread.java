public class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Thread name="+Thread.currentThread().getName());
        for(int i=1; i<=4; i++)
        {
            try
            {
                Thread.sleep(3000);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        // creating three threads
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        // thread t1 starts
        t1.start();
        // starts second thread when first thread t1 is died.
        try
        {
            t1.join();
        }catch(Exception e){System.out.println(e);}
        // start t2 and t3 thread
        t2.start();
        t3.start();
    }
}
