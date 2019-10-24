import java.util.ArrayList;
import java.util.List;

/**
 * @author Bischev Ramil
 * @since 2019-10-24
 * You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters.
 * Trailing spaces should be removed, and every line must be terminated with a newline character (\n).
 *
 * Return null if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.
 */

public class Diamond {
    public static String print(int n) {
        if (n % 2 == 0 || n < 1) {
            return null;
        }
        List<String> out = new ArrayList<>();

        for (int i = 1; i <= n; i = i + 2) {
            int foo = n - i;
            for (int k = 1; k <= foo / 2; foo = foo - 2) {
                out.add(" ");
            }
            for (int j = 1; j <= i; j++) {
                out.add("*");
            }
            out.add("\n");
        }

        for (int i = n - 2; i >= 1; i = i - 2) {
            int foo = n - i;
            for (int k = 1; k <= foo / 2; k++) {
                out.add(" ");
            }
            for (int j = i; j >= 1; j--) {
                out.add("*");
            }
            out.add("\n");
        }
        return String.join("", out);
    }
}
