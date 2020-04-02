package com.example.demo.happy;

public class XiaoMiPhone implements Phone{

    public XiaoMiPhone(){
        this.made();
    }

    @Override
    public void made() {
        System.out.println("制作小米手机");
    }
}
