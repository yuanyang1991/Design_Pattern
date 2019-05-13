import data.Data;
import inter.Observer;
import inter.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private Data mData;

    private List<Observer> observers;


    @Override
    public void registerListener(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("observer can not null");
        }
        if (observers == null) {
            observers = new ArrayList<>();
        }
        observers.add(observer);
    }

    @Override
    public void unRegisterListener(Observer observer) {
        if (observers != null){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyChange() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public Data getData() {
        return mData;
    }

    public void setData(Data data){
        mData = data;
    }
}
