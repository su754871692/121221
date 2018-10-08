

public class site1 implements Runnable{
    int count=10;
    int num=0;
    @Override
    public void run() {
        while(true){
            synchronized (this){
                if(count<=0){
                    break;
                }

                count--;
                num++;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"抢到了第"+num+"张票，剩余"+count+"张");
            }
        }
    }

    public static void main(String[] args) {
        Site s = new Site();
        Thread t1 = new Thread(s,"张三");
        Thread t2 = new Thread(s,"赵四");
        Thread t3 = new Thread(s,"王五");

        t1.start();
        t2.start();
        t3.start();
    }
}
