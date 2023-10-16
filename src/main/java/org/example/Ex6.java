package org.example;

public class Ex6 {


    public int digitSum(int num) {
        int sum = 0;
        int numberOfDigits = 0;

        while (num > 0) {

            int digit = num % 10;
            numberOfDigits ++;
            sum += digit;
            num /= 10;
        }

        return sum/numberOfDigits;
    }
}
