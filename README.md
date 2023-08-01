# 设计模式示例代码

[TOC]



## 一、创建型设计模式

创建型模式（Creational Patterns）：关注如何创建对象，以适应不同的场景和需求。

### 1.1 工厂模式

工厂模式（Factory Pattern）是一种常见的创建型设计模式，旨在通过提供一个统一的接口来创建对象，而不暴露对象的创建逻辑。它允许将对象的实例化过程从客户端代码中分离出来，从而使代码更加灵活、可扩展和易于维护。

工厂模式有几种不同的变体，包括简单工厂模式、工厂方法模式和抽象工厂模式。



#### 1.1.1 简单工厂模式

>   01-creation-patterns/01-factory-patterns/01-simple-factory-patterns

简单工厂模式（Simple Factory Pattern）并不是一个标准的设计模式，但它通常作为工厂模式的起点进行讨论。在简单工厂模式中，有一个工厂类负责根据给定的参数来创建对象（换言之，<u>一个工厂类负责多个产品类</u>）。客户端只需要向工厂传递合适的参数，而无需关心具体的对象创建过程。但这种模式有一定的局限性，因为当需要添加新类型的产品时，必须修改工厂类的代码，违背了开闭原则（Open-Closed Principle）。

适用场景：

-   产品类较少，且产品对象创建逻辑简单



#### 1.1.2 工厂方法模式

>   01-creation-patterns/01-factory-patterns/02-factory-method-patterns

工厂方法模式（Factory Method Pattern）通过将对象的创建委托给子类来解决简单工厂模式的限制性问题。<u>每个产品类都有对应的工厂类</u>，而这些工厂类继承自一个共同的抽象工厂类或接口。客户端代码通过调用工厂方法来创建对象，具体创建哪种对象由子类决定。这样，当需要添加新的产品类型时，只需要添加一个新的具体产品类和对应的工厂类，而无需修改现有的代码。

适用场景：

-   产品类较多
-   产品对象的创建逻辑相对复杂
-   各产品的对象创建逻辑不同



#### 1.1.3 抽象工厂模式

>   01-creation-patterns/01-factory-patterns/03-abstract-factory-patterns

抽象工厂模式（Abstract Factory Pattern）提供了一种创建一系列相关或依赖对象的接口，而无需指定具体实现类。它通过引入抽象工厂和一组抽象产品类来实现。<u>每个具体的工厂类都负责创建一族产品，并且这些产品之间有一定的相关性</u>。客户端通过使用抽象工厂接口和抽象产品类，可以创建需要的产品族，而不用关心具体的实现细节。

适用场景：

-   需要创建一系列相关或依赖的产品类



### 1.2 单例模式

>   01-creation-patterns/02-singleton-patterns

单例模式（Singleton Pattern）是一种创建型设计模式，它确保一个类只有一个实例，并提供一个全局访问点来访问这个唯一实例。这意味着在整个程序运行期间，无论在何处访问该类，都只会得到同一个实例对象。单例模式在很多场景中都有用处，例如需要控制资源访问、配置管理、日志记录、线程池、数据库连接等。

单例模式有三种常见的实现方案：饿汉式（Eager Initialization）、懒汉式（Lazy Initialization）、双重检查锁定（Double-Checked Locking）



#### 1.2.1 饿汉式-单例模式

在类加载时就创建实例，无论是否使用都会创建。这种方式简单直接，不存在多线程并发问题，适用于实例较小且在程序运行期间一直需要被使用的情况。

适用场景：

-   实例较小
-   实例使用频繁：因为不需要考虑并发问题，所以在获取实例的性能上占优势



#### 1.2.2 懒汉式-单例模式

在需要使用的时候才去创建实例。懒汉式单例模式可以避免资源浪费，但需要注意多线程环境下的并发问题。

适用场景：

-   实例较大，创建和初始化需要花费较多的资源和时间
-   实例不一定会被使用



#### 1.2.3 双重检查锁定-单例模式

在懒汉式的基础上做了进一步的优化：实例创建完成后无需加锁，提高访问性能

适用场景：

-   实例较大，创建和初始化需要花费较多的资源和时间
-   实例使用频繁：在多线程环境下频繁获取实例，需要通过双重检查锁定来提高性能



### 1.3 原型模式

>   01-creation-patterns/03-prototype-patterns

原型模式（Prototype Pattern）是一种创建型设计模式，旨在通过克隆（复制）现有对象来创建新对象，以减少对象创建的开销，并且避免昂贵的资源初始化过程。它适用于那些对象创建过程较为复杂且需要重复创建相似对象的情况。

适用场景：

-   对象创建过程较为复杂且需要重复创建相似对象



### 1.4 建造者模式

>   01-creation-patterns/04-builder-patterns

建造者模式（Builder Pattern）是一种创建型设计模式，通常用于创建<u>具有多个组成部分的复杂对象</u>。建造者模式的优势在于构建复杂对象时的灵活性和可扩展性。

适用场景：

-   对象组成部分比较多，构建过程十分复杂

    >   Spring中的BeanDefinition就是一种复杂的类，为此Spring提供了BeanDefinitionBuilder

-   构建过程存在可选部分：建造者模式可以很好地支持增量构建对象



## 二、结构型设计模式

结构型模式（Structural Patterns）：关注如何组合类和对象以形成更大的结构，并提供新的功能。





## 三、行为型设计模式

行为型模式（Behavioral Patterns）：关注对象之间的通信和责任分配，以更好地组织和管理代码。
