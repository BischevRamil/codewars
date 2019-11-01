import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Bischev Ramil
 * @since 2019-11-1
 * Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which
 * are substrings of strings of a2.
 *
 * #Example 1: a1 = ["arp", "live", "strong"]
 *
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 *
 * returns ["arp", "live", "strong"]
 *
 * #Example 2: a1 = ["tarp", "mice", "bull"]
 *
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 *
 * returns []
 */
public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        List<String> result = new ArrayList<>();
        List<String> resultOut = new ArrayList<>();
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i].contains(array1[j])) {
                    result.add(array1[j]);
                }
            }
        }
        resultOut = result.stream().distinct().sorted().collect(Collectors.toList());
        String[] out = new String[resultOut.size()];
        for (int i =0; i < resultOut.size(); i++) {
            out[i] = resultOut.get(i);
        }
        return out;
    }
}
