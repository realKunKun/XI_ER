import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
//模仿着写了一个，感谢大佬指点
public class Multithreading_Another {
    static AtomicInteger num = new AtomicInteger(1);

    public static void main(String[] args) {
    Print p1=new Print();
    Print p2=new Print();
    Thread t1=new Thread(p1);
    Thread t2=new Thread(p2);
    t1.setName("线程1 ");
    t2.setName("线程2 ");
    p1.setT(t2);
    p2.setT(t1);
    t1.start();
    t2.start();
    LockSupport.unpark(t1);//唤醒线程1
    }
    static class Print implements Runnable{
        private volatile Thread t;
        @Override
        public void run(){
            while(true){
                LockSupport.park();
                if(num.get()>10){
                    LockSupport.unpark(t);
                    return;
                }
                System.out.println(Thread.currentThread().getName()+":"+num.getAndIncrement());
                LockSupport.unpark(t);
            }

        }
        public void setT(Thread t){
            this.t=t;
        }
    }
}
