package com.xzy.composite;

import com.xzy.composite.pattern.demo2.File;
import com.xzy.composite.pattern.demo2.Folder;

/**
 * @author xzy.xiao
 * @date 2023/8/5  17:06
 */
public class Demo2Test {
    public static void main(String[] args) {
        File img1 = new File("aaa.jpeg");
        File img2 = new File("bbb.jpeg");
        File img3 = new File("ccc.jpeg");
        Folder imgFolder = new Folder("img");
        imgFolder.add(img1);
        imgFolder.add(img2);
        imgFolder.add(img3);
        Folder rootFolder = new Folder("root");
        rootFolder.add(imgFolder);


        img1.display();
        img2.display();
        img3.display();
        imgFolder.display();
        rootFolder.display();
    }
}
