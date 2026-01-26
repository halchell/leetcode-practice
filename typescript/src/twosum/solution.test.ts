import { describe, test, expect } from 'vitest';
import { TwoSumSolver } from './types';
import { bruteForceSolution } from './brute-force-solution';
import { twoPassHashTableSolution } from './twopass-hashtable-solution';

const solutions: [string, TwoSumSolver][] = [
  ['BruteForceSolution', bruteForceSolution],
  ['TwoPassHashTableSolution', twoPassHashTableSolution],
];

describe('Two Sum', () => {
  describe.each(solutions)('%s', (_, solution) => {
    test('should find two numbers that add up to target', () => {
      const nums = [2, 7, 11, 15];
      const target = 9;
      expect(solution(nums, target)).toEqual([0, 1]);
    });

    test('should find answer in the middle of array', () => {
      const nums = [3, 2, 4];
      const target = 6;
      expect(solution(nums, target)).toEqual([1, 2]);
    });

    test('should handle minimum size array', () => {
      const nums = [1, 2];
      const target = 3;
      expect(solution(nums, target)).toEqual([0, 1]);
    });

    test('should handle negative numbers', () => {
      const nums = [-1, -2, -3, -4, -5];
      const target = -8;
      expect(solution(nums, target)).toEqual([2, 4]);
    });

    test('should handle arrays containing zero', () => {
      const nums = [0, 4, 3, 0];
      const target = 0;
      expect(solution(nums, target)).toEqual([0, 3]);
    });

    test('should handle duplicate numbers', () => {
      const nums = [3, 3];
      const target = 6;
      expect(solution(nums, target)).toEqual([0, 1]);
    });

    test('should handle large numbers', () => {
      const nums = [1000000, 2000000];
      const target = 3000000;
      expect(solution(nums, target)).toEqual([0, 1]);
    });

    test('should return empty array when no solution exists', () => {
      const nums = [1, 2, 3];
      const target = 10;
      expect(solution(nums, target)).toEqual([]);
    });
  });
});
