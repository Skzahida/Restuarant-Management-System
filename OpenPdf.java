/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class OpenPdf {
    public static void openById(String Id){
    try{
        
       if((new File ("H:\\"+Id+".pdf")).exists())
       {
         Process p = Runtime
                 .getRuntime()
                 .exec("rundll32 url.dll,FileProtocolHandler H:\\"+Id+".pdf");
       }
       else
       {
       JOptionPane.showMessageDialog(null, "File is not Exists");
       }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }
    
}
