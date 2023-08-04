package com.xzy.bridge.pattern.shape.impl;

import com.xzy.bridge.pattern.draw.DrawingAPI;
import com.xzy.bridge.pattern.shape.Shape;

/**
 * 具体抽象部分的实现
 *
 * @author xzy.xiao
 * @date 2023/8/4  10:09
 */
public class Circle implements Shape {
    private int x, y, radius;
    private DrawingAPI drawingAPI;

    public Circle(int x, int y, int radius, DrawingAPI drawingAPI) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.drawingAPI = drawingAPI;
    }

    @Override
    public void draw() {
        drawingAPI.drawShape(x, y);
        System.out.println("Drawing a circle with radius " + radius);
    }
}
