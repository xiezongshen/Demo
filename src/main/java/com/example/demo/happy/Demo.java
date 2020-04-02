package com.example.demo.happy;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        XiaoMiPhone xiaoMi = (XiaoMiPhone) phoneFactory.madePhone("XM");
        IPhone iPhone = (IPhone) phoneFactory.madePhone("IPhone");
        System.out.println(xiaoMi+":"+iPhone);
    }
}
