package com.example.designPattern.proxy;

/**
 * @Author Legion
 * @Create 2020/11/14 16:01
 */
public class Client {
    public static void main(String[] args) {
        Searcher searcher = ProxySeacher.newInstance();
        searcher.doSearch("001","新冠");
    }
}
