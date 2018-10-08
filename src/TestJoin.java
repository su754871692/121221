public class TestJoin implements Runnable {
    @Override
    public void run() {
        for (int i=1;i<10;i++){
           /* try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.out.println(Thread.currentThread().getName()+"YUNXING"+i);
        }
    }

    public static void main(String[] args) {
        TestJoin j=new TestJoin();
        Thread t=new Thread(j);
t.setPriority(Thread.MAX_PRIORITY);
       t.start();

        for (int i=1;i<10;i++){
/*      if(i==5){
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }*/

            System.out.println(Thread.currentThread().getName()+"CHARU"+i);
        }

    }
}
