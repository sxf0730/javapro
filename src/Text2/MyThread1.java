package Text2;

public class MyThread1 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            try {
                Thread.sleep(1000);//表示一千毫秒内不会抢占cpu，但不代表1000毫秒后会继续执行，而是会继续抢占cpu，但是不一定能抢到
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Thread.currentThread()获取当前正在执行的线程//
            System.out.println(Thread.currentThread().getName()+"线程输出-----"+i);
        }
    }
}
