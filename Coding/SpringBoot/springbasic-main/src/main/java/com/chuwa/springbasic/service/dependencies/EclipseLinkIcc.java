package com.chuwa.springbasic.service.dependencies;

import org.springframework.stereotype.Component;

/**
 * @author b1go
 * @date 9/3/22 12:48 AM
 *
 * 注意这里没有@Component，它不会被加入到容器中。
 * 容器中有唯一bean
 * 真实的dependency 可以在pom中更换，删掉Hibernate，添加EclipseLink,保证唯一bean
 */
public class EclipseLinkIcc implements JpaICC {
    @Override
    public void printMessage() {
        System.out.println("Message from " + getClass().getName());
    }
}
