package ru.netology.sqr;

public class SQRService {
    public int calculate(int lowlimit, int uplimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (lowlimit <= sqr && sqr <= uplimit) {
                count = count + 1;
            }
        }
        return count;
    }

}
