package javabasics.objectOrientedProgramming;

/**
 * 语法格式：修饰符 类型 属性名 = 初值;
 * 说明：修饰符 private:该属性只能由该类的方法访问。
 *      修饰符 public：属性可以被该类以外的方法访问。
 *      类型：任何基本类型，如int、boolean或任何类。
 *
 * 举例：
 * public class Person() {
 *     private int age;  //声明private变量age
 *     public String name = "Lila";//声明public变量name
 * }
 *
 * 变量的分类：成员变量与局部变量
 *      在方法体外，类体内声明的变量称为成员变量。
 *      在方法体内部声明的变量称为局部变量。
 * 成员变量包括：实例变量（不以static修饰），类变量（以static修饰）
 * 局部变量包括：形参（方法签名中定义的变量）、方法局部变量（在方法内定义）、代码块局部变量（在代码块内定义）
 *
 *
 * 成员变量（属性）和局部变量的区别
 * 成员变量：
 * 成员变量定义在类中，在整个类中都可以被访问。
 * 成员变量分为类成员变量和实例成员变量，实例变量存在于对象所在的堆内存中。
 * 成员变量有默认初始化值。
 * 成员变量的权限修饰符可以根据需要，选择任意一个
 *
 * 局部变量：
 * 局部变量值定义在局部范围内，如：方法内，代码块内等。
 * 局部变量存在于栈内存中。
 * 作用的范围结束，变量空间会自动释放。
 * 局部变量没有默认初始化值，每次必须显式初始化。
 * 局部变量声明时不指定权限修饰符
 *
 */
public class ClassAttributes {
    public String name = "张三";//public公有的，这样的类的变量可以在类的外部使用，也可以在本类的方法使用
    private int age; //private私有的，可以在本类的方法使用，不能做类的外部使用
    //修饰符可以用来修饰变量，可以指明变量是一个公有的还是私有的，私有的类变量不能通过对象.属性的方式调用
    //实例变量就是说在类实例化成对象之后才能使用

    public static String sex = "男"; //static，意思是静态的，这样的变量不需要类实例化就可以使用，直接就通过类名.属性这样的方式直接调用，这种就是类变量

    public void showAge(){
        System.out.println(age);
    }

    public void eat(String food){//方法签名中定义的变量
        int i = 0; //方法局部变量
    }

    {
        //这就是代码块
        int i = 0; //代码块局部变量
    }
}
