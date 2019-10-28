package com.course.testNG.TestNGexceptions;

import org.testng.Assert;
import org.testng.annotations.*;

public class GroupTest {
    /**
     * 分组测试即为使用group，如果你使用xml的话就是里边的<groups>标签，
     * 如果是直接在class中，是通过@Test(groups="group2")这种方式来分组
     */
    @Test(groups="group1")
    public void test1() {
        System.out.println("分组1test1 from group1");
        Assert.assertTrue(true);
    }

    @Test(groups="group1")
    public void test11() {
        System.out.println("分组1test11 from group1");
        Assert.assertTrue(true);
    }

    @Test(groups="group2")
    public void test2()
    {
        System.out.println("分组2test2 from group2");
        Assert.assertTrue(true);
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("before测试方法前Test");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("after测试方法后Test");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("before类前Class");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("after类后Class");
    }

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("before套件前Suite");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("after套件后Suite");
    }

    @BeforeGroups(groups="group1")
    public void beforeGroups()
    {
        System.out.println("before分组前Groups");
    }

    @AfterGroups(groups="group1")
    public void afterGroups()
    {
        System.out.println("after分组后Groups");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("before方法前Method");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("after方法后Method");
    }

}
