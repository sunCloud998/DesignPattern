package com.sfy.bridge;

/**
 * 桥接模式：
 * 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。这种类型的设计模式属于结构型模式，
 * 它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
 * @Description: BridgePatternDemo.java
 * @Date: 2016/05/13
 * @Author: sunfayun
 * @Version: 1.0
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(),100,100,10);
        redCircle.draw();

        Shape greenCircle = new Circle(new GreenCircle(),100,100,10);
        greenCircle.draw();
    }

}
