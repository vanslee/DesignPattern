package Visitor;

public class Book implements ItemElement {
    private String title;
    private double price;
    private String isbn;

    public Book(String title, double price, String isbn) {
        this.title = title;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
