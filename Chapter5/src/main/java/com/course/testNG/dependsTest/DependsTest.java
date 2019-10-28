package com.course.testNG.dependsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsTest {
    /**
     * 支持在测试方法之间显式依赖的声明。
     * TestNG允许指定依赖关系：
     *
     * 在@Test注释中使用属性dependsOnMethods
     * 在@Test注释中使用属性dependsOnGroups
     */
    /**
     * 除此之外依赖还分为hard依赖和soft依赖：
     *
     * hard依赖：默认为此依赖方式，即其所有依赖的methods或者groups必须全部pass，否则被标识依赖的类或者方法将会被略过，
     * 在报告中标识为skip，如后面的范例所示，此为默认的依赖方式；
     * soft依赖：此方式下，其依赖的方法或者组有不是全部pass也不会影响被标识依赖的类或者方法的运行，
     * 注意如果使用此方式，则依赖者和被依赖者之间必须不存在成功失败的因果关系，否则会导致用例失败。
     * 此方法在注解中需要加入alwaysRun=true即可，如@Test(dependsOnMethods= {"TestNgLearn1"}， alwaysRun=true)；
     */

    @Test(enabled = true)
    public void TestNgLearn1() {
        System.out.println("this is TestNG test case1");
    }

    @Test(dependsOnMethods= {"TestNgLearn1"})
    public void TestNgLearn2() {
        System.out.println("this is TestNG test case2");
    }
    @Test(groups="init",enabled = true)
    public void test1() {
        System.out.println("init组test1 from group1");
        Assert.assertTrue(true);
    }

    @Test(groups="init",enabled = true)
    public void test11() {
        System.out.println("init组test2 from group1");
        Assert.assertTrue(true);
    }


    /**
     *这里init这个group中的两个方法的执行顺序如果没有在xml中指明则每次运行的顺序不能保证
     */
    @Test(dependsOnGroups = { "init.*" })
    public void method1() {
        System.out.println("dependsOnGroups依赖测试");
    }

}
