package com.mp;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/24 21:05
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
