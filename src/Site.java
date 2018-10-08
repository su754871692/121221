public class Site implements Runnable {
    private  int count=10; //总票数
    private int num=0; //已售票数
    public synchronized void p(){
      /*  synchronized (this) {*/
        boolean flag = true;
        if(count<=0){
            flag=false;
            return;
        }
            count--;
            num++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "买了第" + num + "张票" + "剩" + count);
        }
/*    }*/
    @Override
    public void run() {
        while (true) {
            p();
/*            synchronized (this) {
                if (count <= 0) {
                    break;
                }
                count--;
                num++;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "买了第" + num + "张票" + "剩" + count);
            }*/
        }
    }

    public static void main(String[] args) {
        Site s=new Site();
        Thread t1=new Thread(s,"张三");
        Thread t2=new Thread(s,"李四");
        Thread t3=new Thread(s,"王五");
        t1.start();
        t2.start();
        t3.start();
    }
}
