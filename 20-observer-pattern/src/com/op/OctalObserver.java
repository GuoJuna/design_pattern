package com.op;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/23 18:41
 */
public class OctalObserver extends Observer{
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("八进制: "+Integer.toOctalString(subject.getState()));
    }
}
