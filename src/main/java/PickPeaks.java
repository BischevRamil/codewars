/**
 * @author Bischev Ramil
 * @since 2019-10-31
 * In this kata, you will write a function that returns the positions and the values of the "peaks" (or local maxima) of a numeric array.
 *
 * For example, the array arr = [0, 1, 2, 5, 1, 0] has a peak at position 3 with a value of 5 (since arr[3] equals 5).
 *
 * The output will be returned as a Map<String,List>
 *
 * Example: pickPeaks([3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3]) should return {pos: [3, 7], peaks: [6, 3]}
 * All input arrays will be valid integer arrays (although it could still be empty), so you won't need to validate the input.
 *
 * The first and last elements of the array will not be considered as peaks (in the context of a mathematical function,
 * we don't know what is after and before and therefore, we don't know if it is a peak or not).
 *
 * Also, beware of plateaus !!! [1, 2, 2, 2, 1] has a peak while [1, 2, 2, 2, 3] does not. In case of a plateau-peak,
 * please only return the position and value of the beginning of the plateau. For example: pickPeaks([1, 2, 2, 2, 1]) returns {pos: [1], peaks: [2]}
 */

import java.util.*;

public class PickPeaks {
    public static Map<String,List<Integer>> getPeaks(int[] arr) {
        Map<String,List<Integer>> expected = new HashMap<>();
        List<Integer> pos = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < arr.length - 1; i++) {
            if (!isPlateau(arr, i)) {
                if (arr[i] > arr[i - 1] && arr[i] >= arr[i + 1]) {
                    pos.add(i);
                    peaks.add(arr[i]);
                }
            } else if (isPlateau(arr, i) && arr[i] > arr[arr.length - 1]){
                if (arr[i] > arr[i - 1]) {
                    pos.add(i);
                    peaks.add(arr[i]);
                }
            }
        }
        expected.put("pos", new ArrayList<>(pos));
        expected.put("peaks", new ArrayList<>(peaks));
        return expected;
    }

    public static boolean isPlateau(int[] arr, int i) {
        for (int j = i; j < arr.length - 2; j++) {
            if (arr[j] != arr[j + 1]) {
                return false;
            }
        }
        return true;
    }
}
