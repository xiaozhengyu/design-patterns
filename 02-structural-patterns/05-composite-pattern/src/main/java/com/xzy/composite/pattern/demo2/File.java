package com.xzy.composite.pattern.demo2;

/**
 * @author xzy.xiao
 * @date 2023/8/5  17:04
 */
public class File implements FileSystem {
    private final String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("file：" + fileName);
    }
}
