/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jGateway;



/**
 *
 * @author karthik
 */
import java.util.*;
import twitter4j.*;
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Throwable {
        String log="execid";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println(" Enter USERNAME: ");
           String username=br.readLine();
        System.out.println(" Enter PASSWORD: ");
           String passwd=br.readLine();
        FileLog flog=new FileLog(log);
        FileOutputStream out;
            out=new FileOutputStream(log);
        out.write(new String("0").getBytes());
        out.close();
       
      while(true){
       
    
     
        String ID;
      
ID=flog.getID();
    DirectMessages dm=new DirectMessages();
    List<DirectMessage> data=dm.receive(username, passwd);

      for (DirectMessage message : data) {

       int lID=message.getId();
//System.out.println(lID+"  "+ID+" "+(Integer.parseInt(flog.getID())<Integer.parseInt(ID)));

if(lID>Integer.parseInt(ID)){
lID=Integer.parseInt(flog.getID());
        System.out.println("Sender:" + message.getSenderScreenName());
        System.out.println("Text:" + message.getText() + "");
        ID=Integer.toString(message.getId());
        System.out.println("ID:" + ID+ "\n");

         StatusUpdate st=new StatusUpdate();
         String cmd=message.getText();

      RemoteAdmin ra=new RemoteAdmin();
     // System.out.println(ra.execute(cmd));
      try{
        st.update(username, passwd, ra.execute(cmd)==true?cmd+" SUCCESS":cmd+" FAILED");
      }
      catch(Exception e){
      System.out.println("Error ! status  Not updated ");
      }
      }
      flog.setID(ID);
}

      Thread.sleep(3000);

      }


      }

    }
    


  

    


