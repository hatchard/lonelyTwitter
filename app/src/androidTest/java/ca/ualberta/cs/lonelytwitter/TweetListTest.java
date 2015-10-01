package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hatchard on 9/30/15.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }


    public void testRemoveTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihihi");
        tweetList.add(tweet);
        tweetList.remove(tweet);
        assertFalse(tweetList.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihihi");
        assertFalse(tweetList.hasTweet(tweet));
        tweetList.add(tweet);
    }

    public void testAddTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihihi");
        tweetList.add(tweet);
        assertTrue(tweetList.hasTweet(tweet));
        try{
            tweetList.add(tweet);
        }catch (Exception e){
            assertTrue( e instanceof IllegalArgumentException);
        }
    }

    public void testTweetCount(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihihi");
        tweetList.add(tweet);
        Tweet tweet1 = new NormalTweet("heyhey");
        tweetList.add(tweet1);
        assertEquals(tweetList.count(), 2);
    }

    public void testGetTweets(){
        TweetList tweetList = new TweetList();
        //http://stackoverflow.com/questions/16208121/java-create-date-object-using-a-value-string alexey28
        String inputStr = "11-11-2012";
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date inputDate = new Date();
        try {
            inputDate = dateFormat.parse(inputStr);
        } catch (Exception e){}
        Tweet tweet = new NormalTweet("hihihihi",inputDate);
        tweetList.add(tweet);
        Tweet returnedTweet = tweetList.getTweets(0);
        assertTrue((tweet.date.equals(returnedTweet.date)) && (tweet.getText().equals(returnedTweet.getText())));
        String inputStr2 = "11-11-2012";
        DateFormat dateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        Date inputDate2 = new Date();
        try {
            inputDate2 = dateFormat2.parse(inputStr2);
        } catch (Exception e){

        }
        Tweet tweet1 = new NormalTweet("heyhey", inputDate2);
        tweetList.add(tweet1);
        assertTrue((tweet1.date.equals(returnedTweet.date)) && (tweet1.getText().equals(returnedTweet.getText())));
        assertTrue(tweet.date.before(tweet1.date));
    }

}