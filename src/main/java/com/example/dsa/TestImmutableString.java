package com.example.dsa;

public class TestImmutableString {
    public static void main(String[] args) {
        String str = "Java";
        str.concat("Tech");
        System.out.println(str);

        String pwd = "pwd";
        pwd.concat("123");

        StringBuffer sb = new StringBuffer("Java");
        sb.append("Tech");
        System.out.println(sb);
    }
}
