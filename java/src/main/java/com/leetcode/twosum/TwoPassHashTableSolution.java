package com.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoPassHashTableSolution implements TwoSumSolver {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    // First pass: build the hash map
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }

    // Second pass: find the complement
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement) && map.get(complement) != i) {
        return new int[] { i, map.get(complement) };
      }
    }

    // If no valid pair is found, return an empty array
    return new int[] {};
  }
}
