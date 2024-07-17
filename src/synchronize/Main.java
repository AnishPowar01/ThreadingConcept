package synchronize;

public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter();

        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println(counter.getCounter());
    }
}
