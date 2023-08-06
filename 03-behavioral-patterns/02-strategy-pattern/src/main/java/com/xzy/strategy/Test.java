package com.xzy.strategy;

import com.xzy.strategy.pattern.Character;
import com.xzy.strategy.pattern.strategy.impl.ArmorStrategy;
import com.xzy.strategy.pattern.strategy.impl.SwordStrategy;

/**
 * @author xzy
 * @date 2023/8/6 14:14
 */
public class Test {
    public static void main(String[] args) {
        Character character = new Character("张三");

        character.setEquipmentStrategy(new ArmorStrategy()); // 动态的切换策略
        character.useEquipment();

        character.setEquipmentStrategy(new SwordStrategy());
        character.useEquipment();
    }
}
