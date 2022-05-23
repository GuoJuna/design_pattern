package com.op;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/23 18:43
 */
public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("十六进制: "+Integer.toHexString(subject.getState()));
    }
}
