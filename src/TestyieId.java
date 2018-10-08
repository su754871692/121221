public class TestyieId implements Runnable {
    @Override
    public void run() {
        for(int i=1;i<10;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
            if(i==3){
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
       Thread t1=new Thread(new TestyieId(),"线程A");
        Thread t2=new Thread(new TestyieId(),"线程B");
        t1.start();
        t2.start();
    }
}
