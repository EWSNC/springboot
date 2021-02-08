package com.springboot.springboot1.testcode.pojo;

import org.springframework.beans.factory.annotation.Value;

public class TestBean {

    @Value("beanname1")
    private String f1;

    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }
}
