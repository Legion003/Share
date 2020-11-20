package com.example.designPattern.prototype;

/**
 * @Author Legion
 * @Create 2020/11/14 15:28
 */
public class Client {
    public static void main(String[] args) {
        Address address = new Address("guangzhou");
        People people1 = new People(address);
        People people2 = people1.deepClone();

        System.out.println(people2.address.addr);
        System.out.println(people1==people2);
        System.out.println(people1.address==people2.address);
    }
}
