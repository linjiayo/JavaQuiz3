package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    static Set<Character> vowel = new HashSet<>(Arrays.asList('a', 'e', 'i','o', 'u'));
    public static Boolean hasVowels(String word) {
        for (Character c : word.toCharArray()) {
            if (vowel.contains(Character.toLowerCase(c))) {
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (vowel.contains(Character.toLowerCase(word.charAt(i)))) {
                return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        return (vowel.contains(Character.toLowerCase(word.charAt(0))));
    }

    public static Boolean isVowel(Character character) {
        return (vowel.contains(Character.toLowerCase(character)));
    }
}
