package com.chuwa.springbasic.components.impl;

import com.chuwa.springbasic.components.JpaChuwa;
import org.springframework.stereotype.Component;

/**
 * @author bigo
 * Bean名默认是class名，首字母小写
 */
@Component
public class EclipseLinkChuwa implements JpaChuwa {
    @Override
    public void printMessage() {
        System.out.println("Message from " + getClass().getName());
    }
}
