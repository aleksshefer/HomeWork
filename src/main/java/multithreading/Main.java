package multithreading;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        StringConsumer s = new StringConsumer();
//
//        Thread thread1 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                try {
//                    s.sayHallo();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println(Thread.currentThread().getName() + "ended");
//        });
//
//        Thread thread2 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                try {
//                    s.sayHallo();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            }
//            System.out.println(Thread.currentThread().getName() + "ended");
//        });
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
        int[][] array = new int[][]{{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(array));
    }

    public static int maximumWealth(int[][] accounts) {
        int result = 0;
        int temp = 0;

        for (int i = 0; i < accounts.length; i++) {

            for (int k = 0; k < accounts[i].length; k++) {
                temp += accounts[i][k];
            }

            if (result < temp) {
                result = temp;
            }
            temp = 0;
        }
        return result;
    }
}




