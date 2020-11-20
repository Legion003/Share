package com.example.designPattern.proxy;



/**
 * @Author Legion
 * @Create 2020/11/14 15:53
 */
public class Validator {
    private static Validator validator = new Validator();
    private Validator(){}
    public static Validator newInstance(){
        return validator;
    }
    public boolean validate(String userId){
        if (userId.equals("001")){
            return true;
        }
        return false;
    }
}
