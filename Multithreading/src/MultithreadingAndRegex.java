import java.util.Scanner;
import java.util.concurrent.locks.LockSupport;
import java.util.Scanner;
public class MultithreadingAndRegex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your Email");
        String Email=sc.next();
        System.out.println("\n"+EMailRegex(Email));
        int[] a ={1,3,5,7,9};
        int[] b={2,4,6,8,10};
        multithread(a,b);
    }
    //多线程组还在理解，之前没有学过，下面这段代码来自CSDN。
    public static void multithread(int[] a,int[] b){
        Object object = new Object();
        Thread thread1 = new Thread(()  -> {
            synchronized(object){//使用notify和wait时，必须要选获取到锁
                for (int i = 0; i < a.length; i++) {
                    try {
                        System.out.print(a[i]);
                        object.notify();
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                object.notify();//必须加上，否则程序无法结束，两个线程总有一个最后是wait状态，所以此处必须加
            }
        },"t1");
        Thread thread2 = new Thread( () -> {
            synchronized(object){
                for (int i = 0; i < b.length; i++) {
                    try {
                        System.out.print(b[i]);
                        object.notify();
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                object.notify();
            }
        },"t2");
        thread1.start();
        thread2.start();
            }
    public static boolean EMailRegex(String EMail){
        boolean result=false;
        if(EMail.matches(".*@.*\\.com")==true){
            result=true;
        }

        return result;
    }
}