package Struct.Flyweight;

public class Application {
    public static void main(String[] args) {
        // 创建字符
        TextCharacter a1 = CharacterFactory.getCharacter('A', "宋体", 12, false);
        TextCharacter a2 = CharacterFactory.getCharacter('A', "宋体", 12, false); // 应该与a1相同
        TextCharacter b = CharacterFactory.getCharacter('B', "宋体", 12, false);
        TextCharacter a3 = CharacterFactory.getCharacter('A', "黑体", 14, true); // 不同属性

        // 在不同位置显示字符
        a1.display(10, 20);
        a2.display(15, 25);
        b.display(20, 30);
        a3.display(25, 35);

        // 验证对象共享
        System.out.println("a1 和 a2 是同一个对象: " + (a1 == a2));
        System.out.println("a1 和 a3 是同一个对象: " + (a1 == a3));
        System.out.println("池中字符数量: " + CharacterFactory.getPoolSize());
    }
}
