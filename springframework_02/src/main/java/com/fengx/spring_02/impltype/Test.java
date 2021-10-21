package com.fengx.spring_02.impltype;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Fengx
 * @date: 2021-10-19
 * @description: 依赖注入的实现方式
 **/
public class Test {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config-02.xml");
        User fengx = (User)context.getBean("fengx_2");
        System.out.println(fengx);

        // api 构造、注入、组装、注册 bean
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory)context.getBeanFactory();
        AbstractBeanDefinition userBeanDefinition = new RootBeanDefinition(User.class);
        // 构造方法注入
        beanFactory.registerBeanDefinition("ApiUser", userBeanDefinition);
        ConstructorArgumentValues argValues = new ConstructorArgumentValues();
        argValues.addIndexedArgumentValue(0, 1);
        // set 方法注入
        userBeanDefinition.setConstructorArgumentValues(argValues);
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name", "ApiUser"));
        userBeanDefinition.setPropertyValues(propertyValues);
        System.out.println(beanFactory.getBean("ApiUser"));
    }
}
