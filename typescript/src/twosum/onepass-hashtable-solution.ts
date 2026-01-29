import { TwoSumSolver } from "./types";

export const onePassHashTableSolution: TwoSumSolver = (nums, target) => {
  const map: Map<number, number> = new Map();
    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        const complementindex = map.get(complement);
        if (complementindex !== undefined) {
            return [complementindex, i];
        }
        map.set(nums[i], i);
    }
    // If no valid pair is found, return an empty array
    return [];

}