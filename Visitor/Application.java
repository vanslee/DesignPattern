package Visitor;

public class Application {
    public static void main(String[] args) {
        // 创建购物车商品
        ItemElement[] items = new ItemElement[] {
                new Book("设计模式", 60, "ISBN-1234"),
                new Book("Java编程", 45, "ISBN-5678"),
                new Fruit("苹果", 2, 8),
                new Fruit("香蕉", 3, 5)
        };

        // 创建访问者
        Visitor visitor = new ShoppingCartVisitorImpl();

        // 计算总价
        System.out.println("购物车商品明细:");
        for (ItemElement item : items) {
            item.accept(visitor);
        }

        System.out.println("总价: " + visitor.getTotal() + "元");
    }
}
