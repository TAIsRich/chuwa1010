package com.chuwa.redbook.config;

import com.chuwa.redbook.service.PostService;
import com.chuwa.redbook.service.impl.PostServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//configuration 的作用是告诉框架 括号内有东西要交给IOC容器 （变成Bean）
@Configuration
public class CommonConfig {
    // 当需要把第三方lib(即不是我们自己写的代码)放入IOC容器时， 就会用@Bean
    @Bean
    public ModelMapper modelMapper() {return new ModelMapper();}
    //把new 出来的object 放入IOC容器
    // 这样就可以在其他地方通过@Autowired 注入， 比如该modelMapper 就在service层被注入


    // if we don't add @Service annotation in the PostServiceImpl for making it as a bean,
    // we can also add annotation @Bean here
    // This is a way to make our own source code as Bean
//    @Bean
//    public PostService buildPostService() {
//        return new PostServiceImpl();
//    }
}
