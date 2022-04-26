package com.sp;

public class _2_HungerSingleton {

    //创建SingleObject的一个对象
    private static _2_HungerSingleton instance = new _2_HungerSingleton();

    //让构造函数私有化
    private _2_HungerSingleton(){}

    //获取唯一可用的对象
    public static _2_HungerSingleton getInstance(){
        if(instance == null){
            instance = new _2_HungerSingleton();
        }
        return instance;
    }
}
