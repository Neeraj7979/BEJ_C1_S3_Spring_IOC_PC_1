package com.niit.bej;

import com.niit.bej.beans.ConfigBean;
import com.niit.bej.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigBean.class);
        Employee employee1 = applicationContext.getBean(Employee.class);
        System.out.println(employee1);
    }
}
