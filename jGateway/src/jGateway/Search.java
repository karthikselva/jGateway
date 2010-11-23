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
public class Search {


    private String input;


    public Search(){
  input="karthikselva";
    }


    public Search(String in){
        input=in;
    }



     public String[] search() throws TwitterException{
       Twitter twitter = new TwitterFactory().getInstance();
        Query query = new Query("azhaguselvan");
      QueryResult result = twitter.search(query);
         String output[]=new String[50];
         int i=0;
    for (Tweet tweet : result.getTweets()) {
        output[i++]=tweet.getFromUser() + ":" + tweet.getText();
    }
    return output;
    }




    public String[] search(String input) throws TwitterException{
       Twitter twitter = new TwitterFactory().getInstance();
        Query query = new Query("azhaguselvan");
      QueryResult result = twitter.search(query);
         String output[]=new String[result.getTweets().size()];
         int i=0;
    for (Tweet tweet : result.getTweets()) {
        output[i++]=tweet.getFromUser() + ":" + tweet.getText();
    }
    return output;
    }

}
