package com.springdev.di.dependencyinjection;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * Created by oleht on 15.12.2017
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LiveCycleBean) {
            ((LiveCycleBean) bean).beforeInit();
        }

        return bean;
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LiveCycleBean) {
            ((LiveCycleBean) bean).afterInit();
        }

        return bean;
    }
}
