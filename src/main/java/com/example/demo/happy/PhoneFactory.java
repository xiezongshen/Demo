package com.example.demo.happy;

public class PhoneFactory {
    public Phone madePhone(String type){
        if(type == "XM"){
            return new XiaoMiPhone();
        }else if(type == "IPhone"){
            return new IPhone();
        }


        return null;
    }
}
