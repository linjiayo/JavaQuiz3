package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        StringBuilder res = new StringBuilder();
        String[] words = str.split(" ");
        boolean containsVowel = false;
        for (String word : words) {
            if (vowels.contains(Character.toLowerCase(word.charAt(0)))) {
                res.append(word + "way" +" ");
                continue;
            } else {
                for (int i = 1; i < word.length(); i++) {
                    if (vowels.contains(Character.toLowerCase(word.charAt(i)))) {
                        res.append(word.substring(i) + word.substring(0, i) + "ay ");
                        containsVowel = true;
                        break;
                    }
                }
                if (!containsVowel) {
                    res.append(word + "ay ");
                }
            }
        }
        return res.substring(0, res.length() - 1);
    }
}
