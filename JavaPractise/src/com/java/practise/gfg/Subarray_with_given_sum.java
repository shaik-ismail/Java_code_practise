package com.java.practise.gfg;

import java.util.ArrayList;

public class Subarray_with_given_sum {

  public static void main(String[] args) {
    //int[] arr = new int[]{1, 2, 3, 7, 5};
    int[] arr = new int[]{1, 2};
    int n = arr.length;
    int s = 1;
    ArrayList<Integer> result = subarraySum(arr, n, s);
    result.forEach(System.out::println);
  }

  public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
    ArrayList<Integer> list = new ArrayList<>();

    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum = arr[i];
      for (int j = i + 1; j < n; j++) {
        sum += arr[j];
        if (sum == s) {
          list.add(i+1);
          list.add(j+1);
          return list;
        } else if (sum > s) {
          break;
        }
      }
    }

    list.add(-1);
    return list;
  }

}
