package com.chuwa.springbasic.service.dependencies;

import org.springframework.stereotype.Component;

/**
 * @author b1go
 * @date 9/3/22 12:48 AM
 */
@Component
public class HibernateIcc implements JpaICC {
    @Override
    public void printMessage() {
        System.out.println("Message from " + getClass().getName());
    }
}
