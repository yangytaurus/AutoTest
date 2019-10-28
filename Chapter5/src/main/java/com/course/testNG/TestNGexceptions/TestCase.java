package com.course.testNG.TestNGexceptions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
@Test(groups="group2")
public class TestCase {
    @BeforeMethod
    public void beformethod(){
        System.out.println("方法之前运行");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("方法之后运行");
    }
    @Test
    public void TestNgLearn1() {
        System.out.println("类分组this is TestNG test case1");
    }

    @Test
    public void TestNgLearn2() {
        System.out.println("类分组this is TestNG test case2");
    }
}
