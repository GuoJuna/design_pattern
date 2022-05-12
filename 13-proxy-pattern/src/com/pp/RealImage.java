package com.pp;

import com.pp.iface.Image;

/**
 * @author GuoJun
 * @desc 真实对象
 * @since 2022/5/12 21:19
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("加载图片: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("展示中: "+ fileName);
    }
}
