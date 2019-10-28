package com.course.testNG;

import org.testng.annotations.*;

public class BasicAonotation {

    @Test
    public void testCase(){
        System.out.println("测试方法");
    }
    @Test
    public void testCase2(){
        System.out.println("测试方法2");
    }
    @BeforeMethod
    public void beformethod(){
        System.out.println("方法之前运行");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("方法之后运行");
    }
    @BeforeClass
    public void beforClass(){
        System.out.println("只是在类之前运行的方法");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("只是在类之后运行的方法");
    }
    @BeforeSuite
    public void beforSuite(){
        System.out.println("beforSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }
    @BeforeTest
    public void testBeforeTest(){
        System.out.println("测试方法前BeforeTest");
    }
    @AfterTest
    public void testAfterTest(){
        System.out.println("测试方法后AfterTest");
    }
}
