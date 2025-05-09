package Action.Observe;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> list = new ArrayList<>();
    public void attach(Observer ob){
        list.add(ob);

    }
    public void dettach(Observer ob){
        list.remove(ob);
    }
    public void notifyAllObserves(int state){
        for (Observer item : list) {
            item.update(state);
        }
    }
}
