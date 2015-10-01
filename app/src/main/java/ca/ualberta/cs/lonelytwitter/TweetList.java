package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by hatchard on 9/30/15.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    public void add(Tweet tweet) {
        tweets.add(tweet);

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

}
