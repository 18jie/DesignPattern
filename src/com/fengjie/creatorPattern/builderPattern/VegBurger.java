package com.fengjie.creatorPattern.builderPattern;

/**
 * @author fengjie
 * @date 2018:10:06
 */
public class VegBurger extends Burger{

    @Override
    public String name() {
        return "verBurger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
