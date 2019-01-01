package com.me.action.design.m1;

public abstract class DoDishTemplate {
    /**
     * 具体的整个过程
     */
    public void dodish() {
        this.preparation();
        this.doing();
        this.carriedDishes();
    }

    /**
     * 备料
     */
    public abstract void preparation();

    /**
     * 做菜
     */
    public abstract void doing();

    /**
     * 上菜
     */
    public abstract void carriedDishes();
}
