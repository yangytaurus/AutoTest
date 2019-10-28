package com.course.testNG.ParametersTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParametersTestcase2 {
    @DataProvider(name="user")
    public Object[][] provideData() {

        return new Object[][] { { "zhang", 20 }, { "guan", 110 }, { "liu", 210 } };
    }
    @Test (dataProvider = "user")
    public void TestNgLearn1(String string, int num) {
        System.out.println("this is TestNG test case1, and param1 is:"+string+"; param2 is:"+num);
        Assert.assertFalse(false);
    }
    @Test
    public void TestNgLearn2() {
        System.out.println("this is TestNG test case2");
    }
}
