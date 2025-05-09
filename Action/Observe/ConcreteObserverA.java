package Action.Observe;

public class ConcreteObserverA implements Observer{

    @Override
    public void update(int state) {
        System.out.printf("ConcreteObserverA 改变状态: %d \n", state);
    }
    
}
