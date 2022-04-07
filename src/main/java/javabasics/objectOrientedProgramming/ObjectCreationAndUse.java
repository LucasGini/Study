package javabasics.objectOrientedProgramming;

import work.Animal;
import work.Person;

import java.util.Arrays;

/**
 * 类的创建和使用
 * 使用new+构造器创建一个新的对象；
 * 使用"对象名.对象成员"的方式访问对象成员（包括属性和方法）；
 */
public class ObjectCreationAndUse {
    public static void main(String[] args) {
        //实例化Person类，也就是创建Person对象
        Person person = new Person();//声明一个Person类型的变量，变量名person，实例化Person类并且给person赋值，赋值的值就是当前的实例
        //new Person()就是实例化Person类
        person.name = "张三";//给person对象的name属性赋值
        person.showName();//对象的方法调用
        person.age = 20;//给person对象的age属性赋值
        int i = person.getAge();//有返回值的方法，在调用之后就会有一个值，这个值就是方法中return的那部分
        System.out.println(i);

        //实例化一个Animal的对象
        Animal animal = new Animal();
        animal.eat("老鼠");
        animal.move("爬行");
        // 未来可能会学习更加复杂的类，我们会给这些类创建对象，并且使用对象，
        // 对于对象的使用，无外乎就两个地方，操作对象的变量，调用对象方法
    }
}
