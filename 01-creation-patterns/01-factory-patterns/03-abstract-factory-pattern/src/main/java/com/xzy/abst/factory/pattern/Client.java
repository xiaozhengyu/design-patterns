package com.xzy.abst.factory.pattern;

import com.xzy.abst.factory.pattern.factory.AnimalFactory;
import com.xzy.abst.factory.pattern.factory.CatFactory;
import com.xzy.abst.factory.pattern.factory.DogFactory;
import com.xzy.abst.factory.pattern.product.Animal;

/**
 * 客户端
 *
 * @author xzy
 * @date 2023/7/30 21:16
 */
public class Client {
    public static void main(String[] args) {
        // 创建狗工厂
        AnimalFactory dogFactory = new DogFactory();

        // 创建小狗和大狗
        Animal smallDog = dogFactory.createSmallAnimal();
        Animal bigDog = dogFactory.createBigAnimal();

        // 使它们发出声音
        smallDog.makeSound(); // 输出：Small Dog: Woof!
        bigDog.makeSound();   // 输出：Big Dog: Woof Woof!

        // 创建猫工厂
        AnimalFactory catFactory = new CatFactory();

        // 创建小猫和大猫
        Animal smallCat = catFactory.createSmallAnimal();
        Animal bigCat = catFactory.createBigAnimal();

        // 使它们发出声音
        smallCat.makeSound(); // 输出：Small Cat: Meow!
        bigCat.makeSound();   // 输出：Big Cat: Roar!
    }
}
