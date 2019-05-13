import inter.DisplayElement;
import inter.Observer;
import inter.Subject;


/**
 * 信息展示板
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    @Override
    public void display() {
        //display data
    }

    @Override
    public void update(Subject subject) {
        subject.getData();
    }
}
