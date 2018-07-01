package com.xuxianda.StrategyPattern;

/**
 * Created by Xianda Xu on 2018/7/1.
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWays();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
