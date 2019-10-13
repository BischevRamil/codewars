import java.util.ArrayList;
import java.util.List;

/**
 * @author Bischev Ramil
 * @since 2019-10-13
 *
 * Printer Errors
 * For one kind of boxes the printer has to use colors which, for the sake of simplicity, are named with letters from a to m.
 * s="aaabbbbhaijjjm"
 * error_printer(s) => "0/14"
 *
 * s="aaaxbbbbyyhwawiwjjjwwm"
 * error_printer(s) => "8/22"
 */
public class Printer {
    public static String printerError(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        int err = (int) list.stream()
                .filter(a -> a > 'm' & a <= 'z')
                .count();
        return err + "/" + s.length();
    }
}
