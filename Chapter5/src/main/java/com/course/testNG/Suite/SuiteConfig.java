package com.course.testNG.Suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("SuiteConfig 运行了");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("SuiteConfig 结束运行了");
    }
}
