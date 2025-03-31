package org.sft.multiThreading;

public class MTDemo {

    static class Test1 extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Test1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Test2 implements Runnable {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Test2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread th1 = new Thread();
        Thread th2 = new Thread();
        th2.start();
        th1.start();

        System.out.println(th2.getName());
        System.out.println(th2.getId());

        System.out.println(th1.getName());
        System.out.println(th1.getId());
        System.out.println("********************");


        Test1 test1 = new Test1();
        Thread th3 = new Thread(test1);
        th3.start();
        System.out.println(th3.getId());
        System.out.println(th3.getName());

        Test2 test2 = new Test2();
        Thread th4 = new Thread(test2);
        th4.start();
        System.out.println(th4.getId());
        System.out.println(th4.getName());

    }


}
