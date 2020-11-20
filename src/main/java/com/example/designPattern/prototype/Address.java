package com.example.designPattern.prototype;

import java.io.Serializable;

/**
 * @Author Legion
 * @Create 2020/11/14 15:18
 */
public class Address implements Serializable {
    public String addr;

    public Address(String addr) {
        this.addr = addr;
    }

}
