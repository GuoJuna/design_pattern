package com.sp;

/**
 * 懒汉式
 */
public class _1_LazySingleton {
    //创建SingleObject的一个对象
    private static _1_LazySingleton instance;

    //让构造函数私有化
    private _1_LazySingleton(){}

    //获取唯一可用的对象
    public static synchronized  _1_LazySingleton getInstance(){
        if(instance == null){
            instance = new _1_LazySingleton();
        }
        return instance;
    }
}
