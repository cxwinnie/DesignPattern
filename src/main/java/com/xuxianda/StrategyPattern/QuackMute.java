package com.xuxianda.StrategyPattern;

/**
 * Created by Xianda Xu on 2018/7/1.
 */
public class QuackMute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<silence>>");
    }
}
