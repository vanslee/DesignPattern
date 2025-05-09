package Action.Observe;

public class Application {
    public static void main(String[] args) {
        Observer ob1 = new ConcreteObserverA();
        Observer ob2 = new ConcreteObserverB();
        ConcreteSubject sb = new ConcreteSubject();
        sb.attach(ob1);
        sb.attach(ob2);
        sb.setState(10);
        sb.setState(20);
        sb.dettach(ob2);
        sb.setState(30);
    }
}
