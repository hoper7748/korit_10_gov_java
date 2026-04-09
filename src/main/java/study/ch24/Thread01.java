package study.ch24;

public class Thread01 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            for(int i =0 ; i < 100; i ++){
                System.out.println("T1: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(()-> {
            for(int i = 0 ; i < 100; i++){
                System.out.println("T2: " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
            }
        }} );

        thread1.start();
        thread2.start();
    }
}
