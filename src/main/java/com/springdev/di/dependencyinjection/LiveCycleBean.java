package com.springdev.di.dependencyinjection;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by oleht on 12.12.2017
 */
@Component
public class LiveCycleBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LiveCycleBean() {
        System.out.println("[LiveCycleBean] class constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("[LiveCycleBean] afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("[LiveCycleBean] destroy");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("[LiveCycleBean] setBeanName set name: " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("[LiveCycleBean] setBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("[LiveCycleBean] setApplicationContext");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("[LiveCycleBean] postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("[LiveCycleBean] preDestroy");
    }

    public void beforeInit() {
        System.out.println("[LiveCycleBean] beforeInit");
    }

    public void afterInit() {
        System.out.println("[LiveCycleBean] afterInit");
    }
}
