package org.example.hw;

import java.util.Scanner;

//Given two binary strings a and b, return their sum as a binary string.
//
//        Example 1:
//
//        Input: a = "11", b = "1"
//        Output: "100"
//        Example 2:
//
//        Input: a = "1010", b = "1011"
//        Output: "10101"
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Введите бинарное число А: ");
        Scanner scanner = new Scanner(System.in);
        String strA = scanner.nextLine();
        System.out.println("Введите бинарное число B: ");

        String strB = scanner.nextLine();
        scanner.close();
        int C = binarToInt(strA)+binarToInt(strB);
        System.out.printf("Результат сложения: %s", intToBinar(C));

    }

    public static Integer binarToInt (String str_1)
    {
        int result = 0;
        for (int i=str_1.length()-1; i>=0; i--)
        {
            if (str_1.charAt(i) == '1')
            {
                int pow = str_1.length()-1-i;
                result = result + (int) Math.pow(2, pow);
            }

        }
        return result;
    }
    public static String intToBinar(int num)
    {
        int b;
        String result = "";
        while(num !=0 ) {
            b = num%2;
            result = b + result;
            num = num/2;}
        return result;
    }
}
