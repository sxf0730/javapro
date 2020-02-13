package Text2;

public class Mytext2 {
    public static void main(String[] args) {
        MyThread1 myThread1=new MyThread1();
        myThread1.start();
        MyThread1 myThread2=new MyThread1();
        myThread2.start();
        MyThread1 myThread3=new MyThread1();
        myThread3.start();
        MyThread1 myThread4=new MyThread1();
        myThread4.start();
    }
    public static void eat(){}
    public static void talk(){}
    public static void drink(){}

}
