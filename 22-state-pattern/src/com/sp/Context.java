package com.sp;

import com.sp.iface.State;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/25 20:22
 */
public class Context {
    private State state;
    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
