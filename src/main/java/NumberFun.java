/**
 * @author Bischev Ramil
 * @since 2019-10-13
 *
 * You might know some pretty large perfect squares. But what about the NEXT one?
 *
 * Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter.
 * Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
 *
 * If the parameter is itself not a perfect square, than -1 should be returned. You may assume the parameter is positive.
 */
public class NumberFun {
    public static long findNextSquare(long sq) {
        double num = Math.sqrt(sq);
        return num % 1 == 0 ? (long) Math.pow((num + 1), 2) : -1;
    }
}
