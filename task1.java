import java.util.Arrays;
import java.util.Random;

// Task1
// Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
// Для генерации случайного числа используйте метод Math.random(), который возвращает
// значение в промежутке [0, 300].

public class task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int numMin = 299;
        int numMax = 0;
        double summ = 0;
        double summS = 0;
        Random random = new Random();
        for (int index = 0; index < arr.length; index++) {
            arr[index] = random.nextInt(300);
            if (arr[index] < numMin) {
                numMin = arr[index];
            }
            if (arr[index] > numMax) {
                numMax = arr[index];
            }
            summ = summ + arr[index];
        }
        summS = summ / arr.length;
        System.out.println();
        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Максимальное значение: " + numMax);
        System.out.println("Минимальное значение: " + numMin);
        System.out.printf("Среднее значение: %.2f", summS);

    }
}
