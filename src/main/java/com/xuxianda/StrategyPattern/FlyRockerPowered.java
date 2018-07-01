package com.xuxianda.StrategyPattern;

/**
 * Created by Xianda Xu on 2018/7/1.
 */
public class FlyRockerPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!!!");
    }
}
