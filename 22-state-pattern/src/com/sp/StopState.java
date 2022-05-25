package com.sp;

import com.sp.iface.State;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/25 20:26
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("正在结束状态...");
        context.setState(this);
    }

    public String toString(){
        return "结束状态";
    }
}
