package com.chuwa.springbasic.service;

import com.chuwa.springbasic.components.JpaChuwa;
import com.chuwa.springbasic.components.impl.HibernateChuwa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author b1go
 * @date 9/1/22 12:12 AM
 *
 * 1. 如果只有一个impl,则默认用这个impl
 * 2. 如果有多个impl, 则查看是否有@Qualifier
 * 3. 如果有多个impl, 且无@Qualifier, 则查看是否有@Primary (因为这个是type level的)
 * 4. 如果有多个impl, 且无@Qualifier, 且無@Primary, 按变量名(By Name)确定用哪一个
 * 5. 如果依然不能确定用哪一个，则报错(NoUniqueBeanDefinitionException)
 */
@Component
public class DependencyInjectionByTypeByName {
    /**
     * Match by type
     * 变量名您可以随意取
     */
    @Autowired
    private HibernateChuwa hibernate;

    /**
     * Match by Name
     * 变量名必须是某个子类的名称，且首字母小写,
     * 如果是来自于@Bean,则用的是方法名小写。
     */
    @Autowired
    private JpaChuwa hibernateChuwa;

    @Autowired
    private JpaChuwa eclipseLinkChuwa;

    @Autowired
    private JpaChuwa myDataNucleus;

    /**
     * wrong
     * NoUniqueBeanDefinitionException: No qualifying bean of type 'com.chuwa.springbasic.components.JpaChuwa'
     * available: expected single matching bean but found 3: eclipsedLinkChuwa,hibernateChuwa,myDataNucleus
     */
//    @Autowired
//    private JpaChuwa jpaChuwa;


    /**
     * Match by Qualifier
     * 变量名您随意起
     */
    @Autowired
    @Qualifier("hibernateChuwa")
    private JpaChuwa jpaChuwaQualifier;

    public void printFirstMessage() {
        System.out.print("By Type(HibernateChuwa hibernate)         : ");
        hibernate.printMessage();

        System.out.print("By Name(JpaChuwa hibernateChuwa)          : ");
        hibernateChuwa.printMessage();
        System.out.print("By Name(JpaChuwa eclipsedLinkChuwa)       : ");
        eclipseLinkChuwa.printMessage();

        System.out.print("By Name and @Bean:(myDataNucleus())       : ");
        myDataNucleus.printMessage();

        System.out.print("By @Qualifier(\"hibernateChuwa\")         : ");
        jpaChuwaQualifier.printMessage();
    }
}
