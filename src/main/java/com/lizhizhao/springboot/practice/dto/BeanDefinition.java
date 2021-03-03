package com.lizhizhao.springboot.practice.dto;

/**
 * bean的定义
 *
 * @author lizhizhao
 * @since 2020-12-16 09:20
 */
public class BeanDefinition {

    private Class<?> beanClass;

    private String scope;

    private Boolean isLazy;


    public Class<?> getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Boolean getLazy() {
        return isLazy;
    }

    public void setLazy(Boolean lazy) {
        isLazy = lazy;
    }
}
