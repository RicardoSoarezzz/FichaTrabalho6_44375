package org.example;

public class Ex6 {


    public int digitSum(int num) {
        int sum = 0;


        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }
}
