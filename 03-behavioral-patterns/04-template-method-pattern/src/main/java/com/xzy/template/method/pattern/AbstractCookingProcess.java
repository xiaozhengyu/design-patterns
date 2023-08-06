package com.xzy.template.method.pattern;

/**
 * 定义了炒菜的模板
 *
 * @author xzy
 * @date 2023/8/6 17:18
 */
public abstract class AbstractCookingProcess {

    public void cook() {
        prepareIngredients();
        heatPan();
        cookIngredients();
        serve();
    }

    /**
     * 准备食材
     */
    abstract void prepareIngredients();

    /**
     * 热锅
     */
    abstract void heatPan();

    /**
     * 烹饪
     */
    abstract void cookIngredients();

    /**
     * 起锅
     */
    abstract void serve();
}
