package org.example.hw;

import java.util.Scanner;

//2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел,
// после которых следует отрицательное число.
//        Пример ввода:
//        1 2 1 2 -1 1 3 1 3 -1 0
//        Логика расчета:
//        2 -1 переход -> 2 в сумму
//        3 -1 переход -> 3 в сумму
//        Пример вывода: 5
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArray = str.split(" ");
        int a = -1;
        int summa = 0;
        for (String strNum:strArray
             ) {
            int b = Integer.parseInt(strNum);
            if (b<0 && a>0) {
                summa = summa + a;
            }
            a = b;
        }
        System.out.printf("Сумма чисел: %d", summa);
    }
}
