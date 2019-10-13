import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ramil Bischev
 * @since 2019-10-12
 *
 * Count the number of Duplicates
 *
 * Write a function that will return the count of distinct case-insensitive
 * alphabetic characters and numeric digits that occur more than once in the input string.
 * The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
 */
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String test = text.toLowerCase();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < test.length(); i++) {
            list.add(test.charAt(i));
        }
        return (int) list.stream().filter(x -> Collections.frequency(list, x) > 1)
                .distinct()
                .count();
    }
}