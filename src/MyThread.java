public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=1;i<50;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);

        }

    }

    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
        t1.run();
     /*   MyThread t2=new MyThread();
        t2.start();*/

    }

}
