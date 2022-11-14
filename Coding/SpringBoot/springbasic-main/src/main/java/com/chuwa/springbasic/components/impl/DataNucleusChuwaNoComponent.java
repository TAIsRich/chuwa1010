package com.chuwa.springbasic.components.impl;

import com.chuwa.springbasic.components.JpaChuwa;

/**
 * @author bigo
 * No @Compnent, so Spring don't add it to IOC container
 */
public class DataNucleusChuwaNoComponent implements JpaChuwa {

    @Override
    public void printMessage() {
        System.out.println("Message from " + getClass().getName() + " - No @Component. By @Bean!");
    }
}
