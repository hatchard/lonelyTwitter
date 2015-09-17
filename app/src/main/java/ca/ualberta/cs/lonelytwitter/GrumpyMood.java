package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hatchard on 9/16/15.
 */
public class GrumpyMood extends CurrentMood {
    //constructor
    public GrumpyMood(Date date) {
        super(date);
    }

    public String myMood() {
        return "I am Grumpy! >:(";
    }
}
