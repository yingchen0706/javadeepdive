import java.util.Random;

public class HeapSort {
    private void swim(int[] nums, int N) {
        int index = N;

        while (index / 2 >= 1) {
            if (nums[index] > nums[index / 2]) {
                swap(nums, index, index / 2);
                index = index / 2;
            } else {
                break;
            }
        }
    }

    private void dive(int[] nums, int root, int N) {
        int index = root;
        while (index * 2 <= N) {
            int replace = index * 2;
            int right = replace + 1;
            if (right <= N && nums[right] > nums[replace]) {
                replace = right;
            }
            if (nums[replace] > nums[index]) {
                swap(nums, replace, index);
            }
            index = replace;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public void heapSort(int[] nums, int N) {
        for (int i = N / 2; i >= 1; i--) {
            dive(nums, i, N);
        }
        for (int i = 1; i < N; i++) {
            swap(nums, 1, N - i + 1);
            dive(nums, 1, N - i);
        }
    }

    public void insert(int[] nums, int elem, int N) {
        if (N + 1 >= nums.length + 1) {
            return;
        }
        nums[N + 1] = elem;
        swim(nums, N + 1);
    }

    public static void main(String[] args) {
        int N = 100;
        int[] nums = new int[N + 20];
        Random rand = new Random();
        for (int i = 1; i <= N; i++) {
            nums[i] = rand.nextInt(500);
        }
        HeapSort hp = new HeapSort();
        hp.heapSort(nums, N);
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(SortUtil.isSorted(nums, 1, N));
        hp.insert(nums, 40, N);
        System.out.println();
        System.out.println(SortUtil.isSorted(nums, 1, N));
    }
}
