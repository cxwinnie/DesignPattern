package com.xuxianda.StrategyPattern;

/**
 * Created by Xianda Xu on 2018/7/1.
 */
public class FlyNoWays implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
