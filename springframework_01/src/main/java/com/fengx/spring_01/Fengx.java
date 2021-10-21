package com.fengx.spring_01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: Fengx
 * @date: 2021-10-19
 * @description: 自定义注解：为演示可以通过注解查找到 bean 而创建
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Fengx {

}
