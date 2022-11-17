package com.chuwa.springbasic.service.DITypes;

import com.chuwa.springbasic.service.dependencies.JpaICC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author b1go
 * @date 9/1/22 12:12 AM
 */
@Component
public class DependencyInjectionTypesSetter {

    /**
     * type 1, field Injection
     */
//    @Autowired
    private JpaICC jpaICC;

    /**
     * type 2, Constructor Injection
     * @Autowired可以省略
     */
//    @Autowired
//    public DependencyInjectionTypesSetter(JpaICC jpaICC) {
//        this.jpaICC = jpaICC;
//    }

    /**
     * type 3, Setter Injection
     * @Autowired可以省略
     */
    @Autowired
    public void setJpaICC(JpaICC jpaICC) {
        this.jpaICC = jpaICC;
    }

    public void printMessage() {
        jpaICC.printMessage();
    }
}
