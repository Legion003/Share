package com.example.designPattern.prototype;

import java.io.*;

/**
 * @Author Legion
 * @Create 2020/11/14 15:19
 */
public class People implements Serializable {
    public Address address;

    public People(Address address) {
        this.address = address;
    }

    public People deepClone(){
        People people = null;
        // 通过写入流的形式实现深克隆/深拷贝
        try{
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            people = (People) ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return people;
    }

}
