package com.course.testNG.TestNGexceptions;

import org.testng.annotations.Test;

public class runException {
    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1 / 0;
        System.out.println("After division the value of i is :" + i);
    }
    //异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void expectException() {

        System.out.println("After division the value of i is :" );
        throw   new RuntimeException();
    }
    //忽略测试   enabled =false
    @Test(enabled = false)
    public void TestNgLearn1() {
        System.out.println("this is TestNG test case1");
    }
    @Test
    public void TestNgLearn2() {
        System.out.println("this is TestNG test case2");
    }

    //超时测试
    @Test(timeOut = 5000) // time in mulliseconds
    public void testThisShouldPass() throws InterruptedException {
        Thread.sleep(4000);
    }

    @Test(timeOut = 1000)
    public void testThisShouldFail() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("超时测试");
        }

    }


    //分组测试



}