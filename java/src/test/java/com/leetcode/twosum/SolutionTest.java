package com.leetcode.twosum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Two Sum")
class SolutionTest {
    private final BruteForceSolution solution = new BruteForceSolution();

    @Test
    @DisplayName("should find two numbers that add up to target")
    void testBasicCase() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
    }

    @Test
    @DisplayName("should find answer in the middle of array")
    void testMiddleOfArray() {
        int[] nums = {3, 2, 4};
        int target = 6;
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(nums, target));
    }

    @Test
    @DisplayName("should handle minimum size array")
    void testMinimumSize() {
        int[] nums = {1, 2};
        int target = 3;
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
    }

    @Test
    @DisplayName("should handle negative numbers")
    void testNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        assertArrayEquals(new int[]{2, 4}, solution.twoSum(nums, target));
    }

    @Test
    @DisplayName("should handle arrays containing zero")
    void testWithZero() {
        int[] nums = {0, 4, 3, 0};
        int target = 0;
        assertArrayEquals(new int[]{0, 3}, solution.twoSum(nums, target));
    }

    @Test
    @DisplayName("should handle duplicate numbers")
    void testDuplicateNumbers() {
        int[] nums = {3, 3};
        int target = 6;
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
    }

    @Test
    @DisplayName("should handle large numbers")
    void testLargeNumbers() {
        int[] nums = {1000000, 2000000};
        int target = 3000000;
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
    }

    @Test
    @DisplayName("should return empty array when no solution exists")
    void testNoSolution() {
        int[] nums = {1, 2, 3};
        int target = 10;
        assertArrayEquals(new int[]{}, solution.twoSum(nums, target));
    }
}
