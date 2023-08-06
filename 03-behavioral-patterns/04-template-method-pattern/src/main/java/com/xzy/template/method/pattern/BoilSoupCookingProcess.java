package com.xzy.template.method.pattern;

/**
 * @author xzy
 * @date 2023/8/6 17:20
 */
public class BoilSoupCookingProcess extends AbstractCookingProcess {
    /**
     * 准备食材
     */
    @Override
    void prepareIngredients() {
        System.out.println("Prepare vegetables, meat, and broth.");
    }

    /**
     * 热锅
     */
    @Override
    void heatPan() {
        // BoilSoup 不需要热锅，所以这里可以为空实现
    }

    /**
     * 烹饪
     */
    @Override
    void cookIngredients() {
        System.out.println("Boil the ingredients to make soup.");
    }

    /**
     * 起锅
     */
    @Override
    void serve() {
        System.out.println("Serve the hot soup.");
    }
}
