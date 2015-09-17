package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hatchard on 9/16/15.
 */
public class HappyMood extends CurrentMood{
    //constuctor
    public HappyMood(Date date) {
        super(date);
    }

    public String myMood() {
        return "I am Happy! :)";
    }
}
