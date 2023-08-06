package com.xzy.strategy.pattern;

import com.xzy.strategy.pattern.strategy.EquipmentStrategy;

/**
 * 角色
 *
 * @author xzy
 * @date 2023/8/6 14:12
 */
public class Character {
    private String name;
    private EquipmentStrategy equipmentStrategy;

    public Character(String name) {
        this.name = name;
    }

    public void setEquipmentStrategy(EquipmentStrategy equipmentStrategy) {
        this.equipmentStrategy = equipmentStrategy;
    }

    public void useEquipment() {
        if (equipmentStrategy != null) {
            System.out.print(name + "：");
            equipmentStrategy.useEquipment();
        } else {
            System.out.println(name + "尚无装备！");
        }
    }
}
