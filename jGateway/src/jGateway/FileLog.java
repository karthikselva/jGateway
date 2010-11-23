/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jGateway;
import java.io.*;
/**
 *
 * @author karthik
 */
public class FileLog {
    File exec;
      OutputStream out;
     InputStream in;

    FileLog(String location) throws Throwable{
    exec=new File(location);

    
    }




    public String getID() throws Throwable {
        in=new FileInputStream(exec);
             

        in=new FileInputStream(exec);
        int size=in.available();
    
      
    byte b[]=new byte[in.available()];
    in.read(b);
    return new String(b,0,size);


    }


    public void setID(String ID) throws Throwable {

out=new FileOutputStream(exec);
        out.write(ID.getBytes());
        out.close();
    }


}
