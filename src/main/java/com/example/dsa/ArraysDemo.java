package com.example.dsa;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 6, 0, 9};
        //move all zeros to end of array
        int n = arr.length;
        int count = 0;
        for(int i= 0; i < n; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while(count < n){
            arr[count++] =0;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
