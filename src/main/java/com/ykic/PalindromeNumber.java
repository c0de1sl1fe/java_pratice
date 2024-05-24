package com.ykic;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
    public static void main(String[] args) {
//        System.out.println(""+(int)125/10);
//        System.out.println(""+(int)125%10);
//        System.out.println(isPalindrome(121));
        System.out.println();
        int x = 121;
        int tmp = x;
        int tmp1 = x;
        int n = (int)Math.log10((double) x)+1;

        for (int i = 0; i < n; i++) {
            System.out.println(tmp/(int)Math.pow(10, n-i-1));
            tmp%=(int)Math.pow(10, n-i-1);

            System.out.println(tmp1%10);
            tmp1/=10;
        }
    }
    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int n = (int)Math.floor(Math.log10(x))+1;
        int tempNumDiv = x;
        int tempNumMode = x;
        for (int i = 0; i < n; i++) {
            if(tempNumDiv/(int)Math.pow(10, n-i-1) != tempNumMode%10){
                return false;
            }
            tempNumDiv%=(int)Math.pow(10, n-i-1);
            tempNumMode = tempNumMode/10;
        }
        return true;
    }
}
