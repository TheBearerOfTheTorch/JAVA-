/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ica_____final;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author R1001007
 */
public class Audit_class {
    //creating and writng to the audit file
    Formatter x = new Formatter();
    //this function is for opening a file
    public void openFile()
    {
        
        try {
            x = new Formatter("audit.txt");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Audit_class.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    //this fucntion is for writing to a file
    public void writingToFile(String a,String b)
    {
        x.format("%s %s %s","THE USER OF NAME : "+a, "  WITH PASSWORD : "+b," IS LOGGED IN" +"\n");
    }
    //this one closes a file
    public void closeFile()
    {
        x.close();
    }
}
