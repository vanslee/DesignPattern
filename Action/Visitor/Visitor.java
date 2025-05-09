package Action.Visitor;

public interface Visitor {
    void visit(Book book);

    void visit(Fruit fruit);
    double getTotal();
}
