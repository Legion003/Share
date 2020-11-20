package com.example.designPattern.proxy;

/**
 * @Author Legion
 * @Create 2020/11/14 15:53
 */
public class Logger {
    private static Logger logger = new Logger();
    private Logger(){}
    public static Logger newInstance(){
        return logger;
    }
    public void writeLog(String userId, String msg){
        System.out.println(userId+"写日志");
        System.out.println(msg);
    }
}
