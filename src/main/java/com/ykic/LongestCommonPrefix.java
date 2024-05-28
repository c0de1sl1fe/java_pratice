package com.ykic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String res = "";
        String regex = "\\w";
        Matcher matcher;

        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < strs[0].length(); i++) {
            prefix+=(strs[0].charAt(i));
            for (String str: strs) {
                matcher = pattern.matcher(str);
                if (matcher.find()) {
                    if (!matcher.group().equals(prefix)) {
                        return res;
                    }
                } else {
                    return res;
                }
            }
            res=prefix;
            regex+="\\w";
            pattern = Pattern.compile(regex);
        }
        return res;
    }
public static void main(String[] args) {
    String regex = "\\w";
    Matcher matcher = Pattern.compile(regex).matcher("hello");
    matcher.find();
    System.out.println(matcher.group());
    regex +=regex;
    matcher = Pattern.compile(regex).matcher("hello");
    matcher.find();
    System.out.println(matcher.group().equals("he"));
    LongestCommonPrefix.longestCommonPrefix(new String[]{"flower","flower","flower","flower"});
}
}
