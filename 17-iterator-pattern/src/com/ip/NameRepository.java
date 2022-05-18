package com.ip;

import com.ip.iface.Container;
import com.ip.iface.Iterator;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/18 20:28
 */
public class NameRepository implements Container {
    public String[] names = {"张三", "李思", "王五", "赵六", "孙七", "杨八"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;
        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
