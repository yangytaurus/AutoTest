package com.course.testNG.ParametersTest;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
    @BeforeSuite
    @Parameters ({"string","num"})
    public void TestNgLearn1(String string, int num) {
        System.out.println("this is TestNG test case1, and param1 is:"+string+"; param2 is:"+num);
        Assert.assertFalse(false);
    }
    @Test
    public void TestNgLearn2() {
        System.out.println("this is TestNG test case2");
    }
}
