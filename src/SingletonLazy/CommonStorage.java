package SingletonLazy;

import java.util.ArrayList;
import java.util.List;

public class CommonStorage {
    private static CommonStorage instance;

    public static CommonStorage getInstance() {
        if (instance == null) {
            instance = new CommonStorage();
        }
        return instance;
    }

    private ArrayList<Integer> values = new ArrayList<>();

    private CommonStorage() {
    }

    public void addValue(final int value) {
        values.add(value);
    }

    public ArrayList<Integer> getValues() {
        return values;
    }
}
