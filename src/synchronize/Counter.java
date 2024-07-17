package synchronize;

public class Counter {
    private int counter = 0;


    public synchronized void increament () {
        counter++;
    }

    public int getCounter () {
        return counter;
    }
}
