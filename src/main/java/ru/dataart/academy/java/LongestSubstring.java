package ru.dataart.academy.java;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        char[] strToArray = checkString.toCharArray();
        int max = 0, temp = 0, start = 0, end = 1, count = 0;

        if (strToArray.length == 1) {
            return 1;
        }

        for (int i = 0; i < strToArray.length; i++) {
            if (i != strToArray.length - 1) {
                if (strToArray[start] != strToArray[i + 1]) {
                    end++;
                    temp = end - start;

                    for (int k = start; k < end; k++) {
                        for (int j = k + 1; j < end; j++) {
                            if (strToArray[k] == strToArray[j]) {
                                count++;
                                break;
                            }
                        }
                    }
                    if (count > 0) {
                        temp = 0;
                    }
                } else {
                    start++;
                    end = start + 2;
                    i = start;
                }
            }
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
