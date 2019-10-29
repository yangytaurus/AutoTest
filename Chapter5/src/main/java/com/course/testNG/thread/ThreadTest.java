package com.course.testNG.thread;

import org.testng.annotations.Test;

public class ThreadTest {
    @Test
    public void threadTest1(){
        System.out.println("threadTest1 :"+Thread.currentThread().getId());
    }
    @Test
    public void threadTest2(){
        System.out.println("threadTest2 :"+Thread.currentThread().getId());
    }
    @Test
    public void threadTest3(){
        System.out.println("threadTest2 :"+Thread.currentThread().getId());
    }
}
