/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jGateway;

/**
 *
 * @author karthik
 */
import java.io.*;
public class RemoteAdmin {



    public boolean execute(String cmd) {
        try{
    String result="";
    String temp=null;
    Process p=Runtime.getRuntime().exec(cmd);
BufferedReader pin=new BufferedReader(new InputStreamReader(p.getInputStream()));
while((temp=pin.readLine())!=null)
{
result+=temp;
}

System.out.println(result);
    return true;
    }
    catch(Exception e){
        return false;
    }
    }

}
