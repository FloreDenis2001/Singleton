package SingletonEager;

public class SimpleUsage {
    public static void main(String[] args) {
        SimpleCounter simpleCounterA = SimpleCounter.getInstance();
        SimpleCounter simpleCounterB = SimpleCounter.getInstance();
        System.out.println(simpleCounterA == simpleCounterB);

        simpleCounterA.increment();
        simpleCounterB.increment();
        System.out.println(simpleCounterA.getCurrentCount());
        simpleCounterA.increment();
        System.out.println(simpleCounterB.getCurrentCount());
    }
}
