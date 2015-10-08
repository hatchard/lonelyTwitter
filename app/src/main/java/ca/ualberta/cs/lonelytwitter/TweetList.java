package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by hatchard on 9/30/15.
 */
public class TweetList implements MyObservable{
    private ArrayList<MyObserver> myObservers = new ArrayList<MyObserver>();
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();


    public void add(Tweet tweet) {
        tweets.add(tweet);
        notifyObservers();

    }

    public void remove(Tweet tweet) {
        tweets.remove(tweet);
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweets(int index) {
        return tweets.get(index);
    }

    public int count() {
        return tweets.size();
    }

    public void notifyObservers() {
        for (MyObserver observer : myObservers){
            observer.myNotify();
        }

    }


    public void addObserver(MyObserver observer) {
        myObservers.add(observer);
    }

}
