package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {

        int countSolutions = 0;

        for (int firstNum = 0; firstNum < nums.length; firstNum++) {
            for (int secondNum = firstNum + 1; secondNum < nums.length; secondNum++) {
                if ((nums[firstNum] + nums[secondNum]) == target) {
                    countSolutions++;
                    return new int[]{nums[firstNum], nums[secondNum]};
                }
            }
        }
        return new int[]{};
    }
}
