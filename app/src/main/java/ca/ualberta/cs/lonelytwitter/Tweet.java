package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by hatchard on 9/16/15.
 */
public abstract class Tweet implements Tweetable {
    //declare attribute
    private String text;
    protected Date date;

    //constructor


    public Tweet(String tweet, Date date) throws IOException{
        text = tweet; //because no other variable text, looks up to attribute and knows you mean this.text
        this.date = date;
    }

    public Tweet(String tweet) throws IOException {
        this.setText(tweet); //this will make it so any text will not be called by something to long because of restriction in set text
        this.date = new Date(); //date will default to current date and time
    }

    public String getText()  {
        return text;
    }

    public void setText(String text) throws IOException{

        if (text.length() <= 140) { //does check at innermost level
            this.text = text;
        } else {
            throw new IllegalArgumentException("Tweet was too  long!");
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    //the tweet class doesnt
    public abstract Boolean isImportant(); //anything that is a tweet or subclass of tweet will have this isImportant, but don't know what it is yet
}
