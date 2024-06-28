//s23023
//中央値を出す
import java.util.Arrays;

public class d49Q6kadai02 {
    public static void main(String[] args) {
        int[] nums = new int[args.length];

        // Parse arguments into nums array
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }

        // Create an instance of Analyzer and set nums array
        Analyzer analyzer = new Analyzer();
        analyzer.setNums(nums);

        // Print analysis results
        System.out.println("平均値：" + analyzer.getAverage());
        System.out.println("値の範囲：" + analyzer.getRange());
        int[] counts = analyzer.getHighLowCounts();
        System.out.println("平均より大きい値の個数：" + counts[0] + " 平均より小さい値の個数：" + counts[1]);
        System.out.println("中央値：" + analyzer.getMedian());
    }
}

class Analyzer {
    private int[] nums;

    void setNums(int[] nums) {
        this.nums = nums;
    }

    double getAverage() {
        double sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum / nums.length;
    }

    int getRange() {
        Arrays.sort(nums);
        return nums[nums.length - 1] - nums[0];
    }

    int[] getHighLowCounts() {
        double avg = getAverage();
        int high = 0, low = 0;
        for (int n : nums) {
            if (n < avg) {
                low++;
            }
            if (n > avg) {
                high++;
            }
        }
        return new int[]{high, low};
    }

    int getMedian() {
        Arrays.sort(nums);
        int middleIndex = nums.length / 2;
        return nums[middleIndex];
    }
}

