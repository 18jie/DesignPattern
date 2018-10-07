package com.fengjie.creatorPattern.builderPattern;

/**
 * @author fengjie
 * @date 2018:10:06
 */
public class ColdDrink implements Item{
    @Override
    public String name() {
        return null;
    }

    @Override
    public Packing packing() {
        return new Button();
    }

    @Override
    public float price() {
        return 0;
    }
}
