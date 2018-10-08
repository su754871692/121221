public class testSleep {
    public static void main(String[] args) {
        System.out.println("开始了");
        wait.w(5);
        System.out.println("结束了");
    }

}
class wait{
    public static void w(long s){
        for(int i=0;i<s;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

}