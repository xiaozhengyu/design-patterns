package com.xzy.bridge.pattern;

import com.xzy.bridge.pattern.draw.DrawingAPI;
import com.xzy.bridge.pattern.draw.impl.GDIDrawingAPI;
import com.xzy.bridge.pattern.draw.impl.OpenGLDrawingAPI;
import com.xzy.bridge.pattern.shape.Shape;
import com.xzy.bridge.pattern.shape.impl.Circle;
import com.xzy.bridge.pattern.shape.impl.Rectangle;

/**
 * 桥接模式（Bridge Pattern）是一种软件设计模式，它旨在将抽象部分和实现部分分离，
 * 使它们可以独立地进行变化，而不会相互影响。这种模式通过将两种维度的变化分离，帮助
 * 我们更灵活地构建复杂的系统。
 * <p>
 * 在桥接模式中，有两个关键的角色：抽象部分和实现部分。抽象部分包含高层的抽象接口和
 * 方法，它们定义了客户端代码需要使用的操作。而实现部分包含底层的具体实现，负责执行
 * 实际的操作。
 *
 * @author xzy.xiao
 * @date 2023/8/4  10:08
 */
public class Test {

    /*
     * NOTE:
     *
     * 假设我们有一个绘图应用程序，它可以绘制不同形状（圆形、矩形等），并且可以使用
     * 不同的绘图库（OpenGL、GDI等）来绘制这些形状。
     */

    public static void main(String[] args) {
        // 绘画库：实现部分
        DrawingAPI openglAPI = new OpenGLDrawingAPI();
        DrawingAPI gdiAPI = new GDIDrawingAPI();

        // 形状：抽象部分
        Shape circle = new Circle(100, 100, 50, openglAPI);
        Shape rectangle = new Rectangle(200, 200, 100, 50, gdiAPI);

        circle.draw();
        rectangle.draw();
    }

    /*
     * NOTE：
     *
     * 是不是有种似曾相识的感觉？其实很正常，设计模式本就是软件开发过程中总结出来的经验套路，
     * 可能有些套路你平时就一直在用，只不过别人为这种套路做了总结，并且取了个牛逼的名字而已。
     */
}
