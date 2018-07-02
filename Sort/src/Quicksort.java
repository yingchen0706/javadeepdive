import java.util.Random;

public class Quicksort {
    public static void sort(int[] nums) {
        qsort(nums, 0, nums.length - 1);
    }

    public static void qsort(int[] nums, int low, int high) {
        if (low < high) {
            int par = parition(nums, low, high);
            qsort(nums, low, par - 1);
            qsort(nums, par + 1, high);
        }
    }

    public static int parition(int[] nums, int low, int high) {
        int i = low;
        int j = high + 1;
        int p = i;
        while (true) {
            while (nums[++i] < nums[p]) {
                if (i == high) {
                    break;
                }
            }
            while (nums[--j] > nums[p])
                ;
            if (i < j) {
                swap(nums, i, j);
            } else {
                break;
            }
        }
        swap(nums, j, p);
        return j;
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            Random rand = new Random();
            int n = rand.nextInt(1000) + 1;
            nums[i] = n;
        }
        Quicksort.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
