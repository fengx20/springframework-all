package com.fengx.spring_02.datatype;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author: Fengx
 * @date: 2021-10-19
 * @description: 依赖注入，可注入的数据类型
 * 基本类型 double、String、bean、数组、List、Set、Map 的注入
 **/
public class Test {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring-config-01.xml");
        User fengx = (User)factory.getBean("fengx_1");
        System.out.println(fengx);

        SpecialUser specialUser = (SpecialUser)factory.getBean("specialUser");
        // Spring 自建 bean，并未在 spring-config-01.xml 配置文件中申明，却可以注入与依赖查找
        // 通过 autowire="byType" 可以注入成功
        System.out.println(specialUser.getEnvironment());
        System.out.println(factory.getBean(Environment.class));

        // 非 bean，可以注入，但无法通过 getBean 方法依赖查找
        // 通过 autowire="byType" 可以注入成功x
        System.out.println(specialUser.getBeanFactory());
        // getBean 方法无法获取到 BeanFactory
        System.out.println(factory.getBean(BeanFactory.class));
    }
}
