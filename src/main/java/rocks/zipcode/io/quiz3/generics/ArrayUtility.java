package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }


    private Map<SomeType, Integer> getOccurrenceMap() {
        Map<SomeType, Integer> count = new HashMap<>();
        for (int i = 0; i< array.length; i++) {
            if (!count.containsKey(array[i])) {
                count.put(array[i], 1);
                continue;
            }
            count.put(array[i], count.get(array[i])+ 1);
        }
        return count;
    }
    public SomeType findOddOccurringValue() {
        Map<SomeType, Integer> count = getOccurrenceMap();

        for (Map.Entry<SomeType, Integer> entry : count.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        Map<SomeType, Integer> count = getOccurrenceMap();

        for (Map.Entry<SomeType, Integer> entry : count.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                return entry.getKey();
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Map<SomeType, Integer> count = getOccurrenceMap();

        return count.get(valueToEvaluate);
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> res = new ArrayList<>();

        for (SomeType t : array) {
            if (predicate.apply(t)) {
                res.add(t);
            }
        }
        if (array instanceof String[]) {
            return res.toArray((SomeType[]) new String[0]);
        }
        if (array instanceof Integer[]) {
            return res.toArray((SomeType[]) new Integer[0]);
        }
        return null;
    }
}
