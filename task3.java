// Task3
// Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
// Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.

public class task3 {
    public static void main(String[] args) {
        int i, j;
        boolean b;
        for (i = 2; i < 100; i++) {
            b = true;
            for (j = 2; j <= i / j; j++)
                if (i % j == 0) {
                    b = false;
                }
            if (b) {
                System.out.print(i + " ");
            }
        }
    }
}
