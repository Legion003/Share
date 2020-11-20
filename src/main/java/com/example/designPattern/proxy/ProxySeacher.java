package com.example.designPattern.proxy;

import javafx.scene.layout.VBox;

/**
 * @Author Legion
 * @Create 2020/11/14 15:52
 */
public class ProxySeacher implements Searcher {
    private static ProxySeacher proxySeacher = new ProxySeacher();
    private static Searcher searcher;
    private static Validator validator;
    private static Logger logger;
    private ProxySeacher(){
        searcher = RealSearcher.newInstance();
        validator = Validator.newInstance();
        logger = Logger.newInstance();
    }
    public static ProxySeacher newInstance(){
        return proxySeacher;
    }

    @Override
    public void doSearch(String userId, String keyword) {
        boolean validate = validate(userId);
        if(validate){
            searcher.doSearch(userId, keyword);
            writeLog(userId, "验证成功，完成搜索");
        }else {
            this.writeLog(userId, "验证失败");
        }

    }

    public boolean validate(String userId){
        return validator.validate(userId);
    }
    public void writeLog(String userId, String msg){
        logger.writeLog(userId, msg);
    }
}
