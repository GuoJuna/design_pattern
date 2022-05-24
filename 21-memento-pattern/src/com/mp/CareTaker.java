package com.mp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/24 21:09
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
