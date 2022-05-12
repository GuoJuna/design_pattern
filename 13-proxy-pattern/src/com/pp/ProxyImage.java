package com.pp;

import com.pp.iface.Image;

/**
 * @author GuoJun
 * @desc 代理对象
 * @since 2022/5/12 21:22
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
