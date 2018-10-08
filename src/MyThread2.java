import org.omg.PortableServer.THREAD_POLICY_ID;

public class MyThread2 extends Thread {
    @Override
    public void run() {
   for (int i=0;i<20;i++){
       System.out.println(Thread.currentThread().getName()+"+"+i);

   }
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new MyThread2(),"线程A");
        Thread t2=new Thread(new MyThread2(),"线程B");
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
