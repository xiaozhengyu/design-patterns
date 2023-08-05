package com.xzy.composite.pattern.demo2;

import java.util.LinkedList;
import java.util.List;

/**
 * @author xzy.xiao
 * @date 2023/8/5  17:04
 */
public class Folder implements FileSystem {
    private final String folderName;
    private final List<FileSystem> fileList;

    public Folder(String folderName) {
        this.folderName = folderName;
        this.fileList = new LinkedList<>();
    }

    public void add(FileSystem fileSystem) {
        fileList.add(fileSystem);
    }

    public void remove(File file) {
        fileList.remove(file);
    }

    @Override
    public void display() {
        System.out.println("folder：" + folderName);
        for (FileSystem fileSystem : fileList) {
            fileSystem.display();
        }
    }
}
