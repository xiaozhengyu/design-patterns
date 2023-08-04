package com.xzy.bridge.pattern.draw.impl;

import com.xzy.bridge.pattern.draw.DrawingAPI;

/**
 * 具体实现部分的实现
 *
 * @author xzy.xiao
 * @date 2023/8/4  10:12
 */
public class GDIDrawingAPI implements DrawingAPI {
    @Override
    public void drawShape(int x, int y) {
        System.out.println("Drawing shape using GDI at coordinates (" + x + ", " + y + ")");
    }
}
