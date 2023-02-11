import java.util.Arrays;

// Task2
// Реализуйте алгоритм сортировки пузырьком для сортировки массива

public class task2 {
    public static void main(String[] args) {

        int[] nums = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println("Исходная последовательность: " + Arrays.toString(nums));
        int swap;
        System.out.print("Получившаяся последовательность: ");
        for (int i = 0; i < 10 - 1; i++) {
            for (int j = 0; j < 10 - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = swap;
                } else {
                    continue;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", nums[i]);
        }
    }
}