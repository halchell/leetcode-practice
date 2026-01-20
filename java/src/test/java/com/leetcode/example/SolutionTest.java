package com.leetcode.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Example: Add Two Numbers")
class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("should add two positive numbers")
    void testAddPositiveNumbers() {
        assertEquals(5, solution.add(2, 3));
    }

    @Test
    @DisplayName("should add negative numbers")
    void testAddNegativeNumbers() {
        assertEquals(-2, solution.add(-1, -1));
    }

    @Test
    @DisplayName("should add zero")
    void testAddZero() {
        assertEquals(5, solution.add(5, 0));
    }
}
