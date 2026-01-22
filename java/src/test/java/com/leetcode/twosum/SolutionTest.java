package com.leetcode.twosum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

@DisplayName("Two Sum")
class SolutionTest {

    static Stream<TwoSumSolver> solutionProvider() {
        return Stream.of(
            new BruteForceSolution(),
            new TwoPassHashTableSolution()
        );
    }

    @ParameterizedTest
    @MethodSource("solutionProvider")
    @DisplayName("should find two numbers that add up to target")
    void testBasicCase(TwoSumSolver solution) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
    }

    @ParameterizedTest
    @MethodSource("solutionProvider")
    @DisplayName("should find answer in the middle of array")
    void testMiddleOfArray(TwoSumSolver solution) {
        int[] nums = {3, 2, 4};
        int target = 6;
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(nums, target));
    }

    @ParameterizedTest
    @MethodSource("solutionProvider")
    @DisplayName("should handle minimum size array")
    void testMinimumSize(TwoSumSolver solution) {
        int[] nums = {1, 2};
        int target = 3;
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
    }

    @ParameterizedTest
    @MethodSource("solutionProvider")
    @DisplayName("should handle negative numbers")
    void testNegativeNumbers(TwoSumSolver solution) {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        assertArrayEquals(new int[]{2, 4}, solution.twoSum(nums, target));
    }

    @ParameterizedTest
    @MethodSource("solutionProvider")
    @DisplayName("should handle arrays containing zero")
    void testWithZero(TwoSumSolver solution) {
        int[] nums = {0, 4, 3, 0};
        int target = 0;
        assertArrayEquals(new int[]{0, 3}, solution.twoSum(nums, target));
    }

    @ParameterizedTest
    @MethodSource("solutionProvider")
    @DisplayName("should handle duplicate numbers")
    void testDuplicateNumbers(TwoSumSolver solution) {
        int[] nums = {3, 3};
        int target = 6;
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
    }

    @ParameterizedTest
    @MethodSource("solutionProvider")
    @DisplayName("should handle large numbers")
    void testLargeNumbers(TwoSumSolver solution) {
        int[] nums = {1000000, 2000000};
        int target = 3000000;
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, target));
    }

    @ParameterizedTest
    @MethodSource("solutionProvider")
    @DisplayName("should return empty array when no solution exists")
    void testNoSolution(TwoSumSolver solution) {
        int[] nums = {1, 2, 3};
        int target = 10;
        assertArrayEquals(new int[]{}, solution.twoSum(nums, target));
    }
}
