package viikko1;

import java.util.Arrays;

public class ArrayStats {
    public static double average(int[] arr) {
        return arr.length == 0 ? 0.0 : Arrays.stream(arr).average().orElse(0.0);
    }
    
    public static int max(int[] arr) {
        return arr.length == 0 ? Integer.MIN_VALUE : Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
    }
}
