package inter;

/**
 * 观察者
 *
 * 观察天气数据
 */
public interface Observer {


    /**
     * 数据发生改变的时候调用
     */
    void update(Subject subject);

}
