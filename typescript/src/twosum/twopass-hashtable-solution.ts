import { TwoSumSolver } from "./types";

export const twoPassHashTableSolution: TwoSumSolver = (nums, target) => {
  const map: Map<number, number> = new Map();
    for (let i = 0; i < nums.length; i++) {
        map.set(nums[i], i);
    }
    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        const complementindex = map.get(complement);
        if (complementindex !== undefined && complementindex !== i) {
            return [i, complementindex];
        }
    }
    // If no valid pair is found, return an empty array
    return [];
};