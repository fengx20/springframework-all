package com.fengx.spring_02.datatype;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.env.Environment;

/**
 * @author: Fengx
 * @date: 2021-10-19
 * @description: 包含了 BeanFactory 和 Environment 两个类型的属性
 **/
public class SpecialUser {

    private BeanFactory beanFactory;

    private Environment environment;

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
