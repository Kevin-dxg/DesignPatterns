package com.shishike.pad.myapplication.jiekouxingmoshi.JieKouXingPattern;


/**
 *
 * 接口型模式
 *
 * AlarmDoor在概念本质是上Door，Alarm是额外功能。
 *
 * 1、继承关系(is-a)：A is-a B，那么B就是A的父类。 假设你确定两件对象之间是is-a的关系，那么此时你应该使用继承。比方菱形、圆形和方形都是形状的一种。那么他们都应该从形状类继承。
 * 2、从属关系(has-a)：A has a B，那么B就是A的组成部分。 假设你确定两件对象之间是has-a的关系，那么此时你应该使用聚合。比方电脑是由显示器、CPU、硬盘等组成的。那么你应该把显示器、CPU、硬盘这些类聚合成电脑类。
 * 3、组合关系(like-a)：A like a B，那么B就是A的接口。 假设你确定两件对象之间是like-a的关系，那么此时你应该使用组合。比方空调继承于制冷机，但它同一时候有加热功能。那么你应该把让空调继承制冷机类，并实现加热接口。
 *
 */
public class AlarmDoor extends Door implements Alarm{

    @Override
    public void alarm() {

    }

    @Override
    void open() {

    }

    @Override
    void close() {

    }

}
