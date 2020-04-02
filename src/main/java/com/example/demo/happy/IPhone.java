package com.example.demo.happy;

public class IPhone implements Phone{

    public IPhone(){
        this.made();
    }

    @Override
    public void made() {
        System.out.println("IPhone生产");
    }
}
