package com.xzy.strategy.pattern.strategy.impl;

import com.xzy.strategy.pattern.strategy.EquipmentStrategy;

/**
 * 剑（具体策略）
 *
 * @author xzy
 * @date 2023/8/6 14:05
 */
public class SwordStrategy implements EquipmentStrategy {
    @Override
    public void useEquipment() {
        System.out.println("挥剑！");
    }
}
