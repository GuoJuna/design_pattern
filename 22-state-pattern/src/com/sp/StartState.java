package com.sp;

import com.sp.iface.State;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/25 20:23
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("正在开始状态...");
        context.setState(this);
    }

    public String toString(){
        return "开始状态";
    }
}
