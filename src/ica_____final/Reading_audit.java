/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ica_____final;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author R1001007
 */
public class Reading_audit {
    private Scanner x;
    
    public void readF()
    {
        //TFileChooser chooser 
    }
    
    public void openFile() throws FileNotFoundException
    {
        x = new Scanner(new File("audit.txt"));
    }
    public void readFile() throws FileNotFoundException
    {
        while(x.hasNext())
            {
                String a = x.next();
                String b = x.next();
                String c = x.next();
                String d = x.next();
                String e = x.next();
                
                //JOptionPane.showMessageDialog(null, a,b,c,d, e"");
                System.out.printf("%s %s %s %s %s ", a,b,c,d,e);
                
            }
        
    }
    public void closeFile()
    {
        x.close();  
    }
}
