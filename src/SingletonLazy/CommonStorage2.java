package SingletonLazy;

import java.util.ArrayList;
import java.util.List;

public class CommonStorage2 {
    private static CommonStorage2 instance;

    public static CommonStorage2 getInstance() {
        if (instance == null) {
            synchronized (CommonStorage2.class) {
                if (instance == null) {
                    instance = new CommonStorage2();
                }
            }
        }
        return instance;
    }

    private List<Integer> values = new ArrayList<>();

    private CommonStorage2() {
    }

    public void addValue(final int value) {
        values.add(value);
    }

    public List<Integer> getValues() {
        return values;
    }
}
