package com.example.designPattern.proxy;

/**
 * @Author Legion
 * @Create 2020/11/14 15:51
 */
public class RealSearcher implements Searcher{
    private static RealSearcher realSearcher = new RealSearcher();
    private RealSearcher(){}
    public static RealSearcher newInstance(){
        return realSearcher;
    }
    @Override
    public void doSearch(String userId, String keyword) {
        System.out.println("进行搜索: "+keyword);
    }
}
