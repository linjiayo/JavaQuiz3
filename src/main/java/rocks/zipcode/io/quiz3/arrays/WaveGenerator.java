package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            StringBuilder waved = new StringBuilder();
            if (!Character.isLetter(str.charAt(i))) continue;
            for (int j = 0; j < str.length(); j++) {

                if (i == j) {
                    waved.append(Character.toUpperCase(str.charAt(j)));
                } else {
                    waved.append(Character.toLowerCase(str.charAt(j)));
                }
            }
            res.add(waved.toString());
        }
        return res.toArray(new String[0]);
    }
}
