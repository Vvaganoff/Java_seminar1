package org.example.hw;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Given an input string s, reverse the order of the words.
//
//  A word is defined as a sequence of non-space characters. The words in s will be separated by at least
//  one space.
//
// Return a string of the words in reverse order concatenated by a single space.
//
//Input: s = "the sky is blue"
//        Output: "blue is sky the"
//        Note that s may contain leading or trailing spaces or multiple spaces between two words.
//        The returned string should only have a single space separating the words. Do not include
//        any extra spaces.
public class Ex1 {

    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        var str = scanner.nextLine();
        scanner.close();

        String[] array = str.split(" ");

        String[] result = new String[array.length];
        for (int i=0; i<array.length; i++) {
            if(array[i].equals("")){
                result[(result.length-1)-i] = "";

            }
            else
            {
                result[(result.length-1)-i] = array[i];

            }
        }

        for (String str1:result
             ) {
            if(str1.equals("")){

                System.out.printf("%s",str1);
            }
            else
            {

                System.out.printf("%s ",str1);
            }
        }
    }
}
