package com.sp;

public class _3_DclSingleton {

    private volatile static _3_DclSingleton singleton;

    private _3_DclSingleton(){}

    public static _3_DclSingleton getInstance(){
        if(singleton == null){
            synchronized (_3_DclSingleton.class){
                if(singleton == null){
                    singleton = new _3_DclSingleton();
                }
            }
        }
        return singleton;
    }
}
