package com.springdev.di.dependencyinjection;

import com.springdev.di.dependencyinjection.controllers.MyController;
import com.springdev.di.dependencyinjection.controllers.manual.examples.PropertyInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController myControler = (MyController) ctx.getBean("myController");
		myControler.hello();

		System.out.println(ctx.getBean(PropertyInjectionController.class).sayHello());
	}
}