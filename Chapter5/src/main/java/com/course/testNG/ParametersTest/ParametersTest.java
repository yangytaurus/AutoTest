package com.course.testNG.ParametersTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
    @Test
    @Parameters ({"name","num"})
    public void TestNgLearn1(String name, int num) {
        System.out.println("this is TestNG test case1, and param1 is:"+name+"; param2 is:"+num +"。Thread :"+Thread.currentThread().getId());
        //Assert.assertFalse(false);
    }
    @Test
    @Parameters ({"name2","num2"})
    public void TestNgLearn2(String name2, int num2) {
        System.out.println("this is TestNG test case2, and param1 is:"+name2+"; param2 is:"+num2 +"。Thread :"+Thread.currentThread().getId());
        //Assert.assertFalse(false););
        //Assert.assertFalse(false);
    }

}
