package multithreading;

public class StringConsumer {
    private boolean isReady = false;

    public synchronized void sayHallo() throws InterruptedException {
        if (!isReady) {
            System.out.println( "Hallo " );
            isReady = true;
            wait();
        } else {
            System.out.println( "No Hallo " );
            isReady = false;
            notify();
        }
    }

}
