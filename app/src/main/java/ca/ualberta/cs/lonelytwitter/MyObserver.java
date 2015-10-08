package ca.ualberta.cs.lonelytwitter;

/**
 * Created by hatchard on 10/7/15.
 */
public interface MyObserver {
    void addObservable(MyObservable o);
    void myNotify();
}
