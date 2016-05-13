package com.sfy.bridge;

/**
 * 桥接模式：
 * 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。这种类型的设计模式属于结构型模式，
 * 它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
 * @Description: DrawAPI.java
 * @Date: 2016/05/13
 * @Author: sunfayun
 * @Version: 1.0
 */
public interface DrawAPI {

    void drawCircle(int radius,int x,int y);

}
