package Action.Observe;

public class ConcreteSubject extends Subject {
    private int state = -1;

    public void setState(int state) {
        this.state = state;
        System.out.printf("ConcreteObserve changed to %d \n", this.state);
        notifyAllObserves(state);

    }

    public int getState() {
        return state;

    }
}
