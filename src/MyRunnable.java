public class MyRunnable implements Runnable{
    @Override
    public void run() {
       for (int i=1;i<20;i++)
           System.out.println(Thread.currentThread().getName()+":"+i);
    }

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t=new Thread(r);
        t.start();

    }
}
