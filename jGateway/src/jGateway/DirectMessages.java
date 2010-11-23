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
import java.util.*;
public class DirectMessages {


    public String send(String senderID,String senderPassword,String recipientId,String message)throws TwitterException{
     Twitter twitter = new TwitterFactory().getInstance(senderID,senderPassword);
    twitter.sendDirectMessage(recipientId,message);
    return "success";
    }


    public List<DirectMessage> receive(String recipientId,String recipientPassword)throws TwitterException{
  Twitter receiver = new TwitterFactory().getInstance(recipientId,recipientPassword);
    List<DirectMessage> messages = receiver.getDirectMessages();


     return messages;
    }

  
    }

