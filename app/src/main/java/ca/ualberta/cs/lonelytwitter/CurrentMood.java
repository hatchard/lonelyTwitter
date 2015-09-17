package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hatchard on 9/16/15.
 */
//because its abstract cant just have a mood, has to be a happy or grumpy mood
public abstract class CurrentMood {
    //attribute
    protected Date date;

    //constructor
    public CurrentMood(Date date) {
        this.date = date;
    }

    //getter and setter
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String myMood();
}
