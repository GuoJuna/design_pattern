package com.op;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/23 18:38
 */
public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("二进制: "+Integer.toBinaryString(subject.getState()));
    }
}
