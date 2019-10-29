package com.course.testNG.ParametersTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class ParametersTestcase2 {
    @DataProvider(name="user")
    public Object[][] provideData() {

        Object[][] o=new Object[][] { { "zhang", 20 }, { "guan", 110 }, { "liu", 210 } };
        return  o;
    }
    @Test (dataProvider = "user")
    public void TestNgLearn1(String name, int num) {
        System.out.println("this is TestNG test case1, and param1 is:"+name+"; param2 is:"+num);
        Assert.assertFalse(false);
    }
    @Test(dataProvider = "methodDataprovider")
    public void Test1(String name, int num) {
        System.out.println("Test111this is TestNG test1"+name +";"+num);
    }
    @Test(dataProvider = "methodDataprovider")
    public void Test2(String name, int num) {
        System.out.println("Test222this is TestNG test2"+name +";"+num);
    }
    //Method metho 通过反射来找到对应的方法
    @DataProvider(name = "methodDataprovider")
    public Object[][] provideMethodData(Method method) {
        Object[][] objects=null;

        if(method.getName().equals("Test1")){
            objects= new Object[][]{{ "zhangtest1", 20 }, { "guantest1", 110 }};
        }else if(method.getName().equals("Test2")){
            objects= new Object[][]{{ "zhangtest2", 20 }, { "guantest2", 110 }};
        }
        return objects;
    }
}
