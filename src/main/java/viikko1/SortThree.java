package viikko1;

import java.util.Arrays;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        int[] nums = {a, b, c};
        Arrays.sort(nums);
        return nums[0] + "," + nums[1] + "," + nums[2];
    }
}
