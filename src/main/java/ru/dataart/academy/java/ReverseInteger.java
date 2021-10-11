package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) {
        int reversedNum = 0;

        while (inputNumber != 0) {
            reversedNum *= 10;
            reversedNum += inputNumber % 10;
            inputNumber /= 10;
        }

        return reversedNum;
    }
}
