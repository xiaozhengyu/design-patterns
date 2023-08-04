package com.xzy.bridge.pattern.shape.impl;

import com.xzy.bridge.pattern.draw.DrawingAPI;
import com.xzy.bridge.pattern.shape.Shape;

/**
 * 具体抽象部分的实现
 *
 * @author xzy.xiao
 * @date 2023/8/4  10:10
 */
public class Rectangle implements Shape {
    private int x, y, width, height;
    private DrawingAPI drawingAPI;

    public Rectangle(int x, int y, int width, int height, DrawingAPI drawingAPI) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.drawingAPI = drawingAPI;
    }

    @Override
    public void draw() {
        drawingAPI.drawShape(x, y);
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}
