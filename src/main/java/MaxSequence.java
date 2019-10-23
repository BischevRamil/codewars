/**
 * @author Bischev Ramil
 * @since 2019-10-23
 * The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
 *
 * Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
 * // should be 6: {4, -1, 2, 1}
 *
 * Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array.
 * If the list is made up of only negative numbers, return 0 instead.
 *
 * Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
 */

public class MaxSequence {
    public static int sequence(int[] arr) {
        int sum = 0;
        if (isPositive(arr)) {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return sum;
        }

        if (isNull(arr)) {
            return 0;
        }

        int ans = arr[0];
        sum = 0;
        for (int r = 0; r < arr.length; r++) {
            sum += arr[r];
            ans = Math.max(ans, sum);
            sum = Math.max(sum, 0);
        }
        return ans;
    }

    public static boolean isPositive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNull(int[] arr) {
        if (arr.length == 0) {
            return true;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > -1) {
                return false;
            }
        }
        return true;
    }
}


