package inter;


import data.Data;

/**
 * 主题 （被观察者/可观察者）
 */
public interface Subject {

    /**
     * 订阅观察者
     * @param observer
     */
    void registerListener(Observer observer);

    /**
     * 取消订阅观察者
     * @param observer
     */
    void unRegisterListener(Observer observer);

    /**
     * 通知观察者
     */
    void notifyChange();

    /**
     * 用于观察者获取数据
     * @return
     */
    Data getData();


}
