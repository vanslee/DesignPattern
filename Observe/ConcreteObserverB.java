package Observe;

public class ConcreteObserverB implements Observer {

    @Override
    public void update(int state) {
        System.out.printf("ConcreteObserverB 改变状态: %d \n", state);
    }
    
}
