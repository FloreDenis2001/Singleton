package SingletonEager;


public class SimpleCounter {

    private static final SimpleCounter INSTANCE = new SimpleCounter();

    public static SimpleCounter getInstance() {
        return INSTANCE;
    }

    private SimpleCounter() {
    }

    private int currentCount = 0;

    public int getCurrentCount() {
        return currentCount;
    }

    public void increment() {
        currentCount++;
    }
}

