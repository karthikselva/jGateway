/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jGateway;

/**
 *
 * @author karthik
 */
import twitter4j.*;
public class StatusUpdate {
    public int update(String twitterID,String twitterPassword,String message)throws TwitterException{
        // The factory instance is re-useable and thread safe.
    Twitter twitter = new TwitterFactory().getInstance(twitterID,twitterPassword);
    Status status = twitter.updateStatus(message);

    return 1;

    }

}
