package com.xingjingjie.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication//web应用才生效
@EnableConfigurationProperties(XinjingjieProperties.class)
public class XinjingjieAutoConfiguration {

    @Autowired
    XinjingjieProperties xinjingjieProperties;

    @Bean
    public XinjingjieService xinjingjieService(){
        XinjingjieService xinjingjieService = new XinjingjieService();
        xinjingjieService.setXinjingjieProperties(xinjingjieProperties);
        return xinjingjieService;
    }
}
