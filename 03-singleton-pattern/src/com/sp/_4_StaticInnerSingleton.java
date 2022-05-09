package com.sp;

public class _4_StaticInnerSingleton {

    private static class SingletonHolder {
        private static final _4_StaticInnerSingleton instance = new _4_StaticInnerSingleton();
    }

    private _4_StaticInnerSingleton(){}

    public static final _4_StaticInnerSingleton getInstance(){
        return SingletonHolder.instance;
    }

}
