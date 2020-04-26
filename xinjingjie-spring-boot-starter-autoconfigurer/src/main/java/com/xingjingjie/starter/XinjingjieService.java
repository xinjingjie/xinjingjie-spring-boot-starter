package com.xingjingjie.starter;

import org.springframework.beans.factory.annotation.Autowired;

public class XinjingjieService {
    XinjingjieProperties xinjingjieProperties;

    public XinjingjieProperties getXinjingjieProperties() {
        return xinjingjieProperties;
    }

    public void setXinjingjieProperties(XinjingjieProperties xinjingjieProperties) {
        this.xinjingjieProperties = xinjingjieProperties;
    }

    public String index(String name){
        return xinjingjieProperties.getPrefix()+"-"+name+"-"+xinjingjieProperties.getSuffix();
    }
}
