package ca.ualberta.cs.lonelytwitter;

import java.util.Date;



/**
 * Represents a tweet.
 *
 * @author Kehan Wang
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */





public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    Tweet(String message){

        this.message = message;
        date = new Date();
//        message = message;
    }


    /**
     * Constructs a tweet object.
     *
     *
     * @param message tweet message
     * @param date tweet date
     */
    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public String getMessage(){
        return message;
    }

    /**
     * sets tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException the tweet message is over 140 characters.
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public abstract Boolean isImportant();
}
