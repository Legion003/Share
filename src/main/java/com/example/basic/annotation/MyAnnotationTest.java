package com.example.basic.annotation;

/**
 * @Author Legion
 * @Create 2020/11/14 14:23
 * 使用自定义注解样例
 */
public class MyAnnotationTest {
    public static void main(String[] args) {
        try {
            // 通过反射获得Person类
            Class<?> personClass = Class.forName("com.example.basic.annotation.Person");
            // 判断该注解是否存在于该类上
            boolean annotationPresent = personClass.isAnnotationPresent(MyAnnotation.class);
            if(annotationPresent){
                // 获取注解并获取注解的属性
                MyAnnotation myAnnotation = personClass.getDeclaredAnnotation(MyAnnotation.class);
                System.out.println(myAnnotation.name());
                System.out.println(myAnnotation.age());
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
