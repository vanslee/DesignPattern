package Visitor;

import java.text.DecimalFormat;

public class ShoppingCartVisitorImpl implements Visitor {

    private double total = 0;
    private DecimalFormat df = new DecimalFormat("#.##");

    @Override
    public void visit(Book book) {
        double cost = book.getPrice();
        if (book.getPrice() > 50) {
            cost -= 5; // 书籍价格超过50有5元折扣
        }
        System.out.println("书籍: " + book.getTitle() +
                ", ISBN: " + book.getIsbn() +
                ", 价格: " + df.format(cost));
        total += cost;
    }

    @Override
    public void visit(Fruit fruit) {
        double cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println("水果: " + fruit.getName() +
                ", 重量: " + fruit.getWeight() + "kg" +
                ", 价格: " + df.format(cost));
        total += cost;
    }

    public double getTotal() {
        return Double.parseDouble(df.format(total));
    }

}
