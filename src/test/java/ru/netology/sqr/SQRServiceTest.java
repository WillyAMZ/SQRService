package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"Min limit values ,99,101,1",
            "Max limit values ,9800,9802,1",
            "Averages values ,2000,4000,19",
            "maximum number of values ,100,9801,90",
            "No min values ,0,99,0",
            "No max values ,9802,2000,0",})
    void shouldCalculate(String testName, int lowlimit, int uplimit, int counter) {
        SQRService calculate = new SQRService();
        int currentCounter = calculate.calculate(lowlimit, uplimit);
        assertEquals(currentCounter, counter);
    }
}