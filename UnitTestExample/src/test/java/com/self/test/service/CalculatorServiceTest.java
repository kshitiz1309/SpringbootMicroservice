package com.self.test.service;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorServiceTest {
    @Test
    public void addTwoNumbersTest(){
        int result = CalculatorService.addTwoNumbers(12,45);
        int expected = 57;
        Assert.assertEquals(expected,result);
    }
}
