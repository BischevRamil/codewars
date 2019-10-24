/**
 * @author Ramil Bischev
 * @since 2019-10-23
 *
 * digital_root(16)
 * => 1 + 6
 * => 7
 *
 * digital_root(942)
 * => 9 + 4 + 2
 * => 15 ...
 * => 1 + 5
 * => 6
 *
 * digital_root(132189)
 * => 1 + 3 + 2 + 1 + 8 + 9
 * => 24 ...
 * => 2 + 4
 * => 6
 *
 * digital_root(493193)
 * => 4 + 9 + 3 + 1 + 9 + 3
 * => 29 ...
 * => 2 + 9
 * => 11 ...
 * => 1 + 1
 * => 2
 */
public class DRootExample {
    public static int digitalRoot(int n) {
        int root = n;
        int sum = 0;
        while (root > 9) {
            while (n != 0) {
                sum += (n % 10);
                n /= 10;
            }
            root = sum;
            n = sum;
            sum = 0;
        }
        return root;
    }
}
