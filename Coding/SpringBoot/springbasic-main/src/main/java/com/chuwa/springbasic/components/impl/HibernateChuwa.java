package com.chuwa.springbasic.components.impl;

import com.chuwa.springbasic.components.JpaChuwa;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author bigo
 * Bean名默认是class名，首字母小写
 */
@Component
//@Primary
public class HibernateChuwa implements JpaChuwa {

    @Override
    public void printMessage() {
        System.out.println("Message from " + getClass().getName());
    }
}
